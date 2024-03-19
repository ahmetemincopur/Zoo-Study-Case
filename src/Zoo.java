import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Zoo {
    AnimalFactory animalFactory = new AnimalFactory();
    private int width;
    private int height;
    public static List<IAnimal> animalList;
    public static List<IAnimal> deleteList;
    public static List<IAnimal> newBornList;
    private int remainingMovement;

    public Zoo(int width, int height) {
        this.width = width;
        this.height = height;
        Zoo.animalList = new ArrayList<>();
        Zoo.deleteList = new ArrayList<>();
        Zoo.newBornList = new ArrayList<>();
        this.remainingMovement = 1000;
    }

    public void addAnimals(String species, int count, String gender) {
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            int x = random.nextInt(this.width);
            int y = random.nextInt(this.height);
            IAnimal animal = new AnimalFactory().getShape(species, gender, x, y);
            Zoo.animalList.add(animal);
        }
    }

    public void addNewBorn(String species, String gender, int x, int y) {
        IAnimal animal = new AnimalFactory().getShape(species, gender, x, y);
        Zoo.newBornList.add(animal);
    }

    public void simulate() {
        while (this.remainingMovement > 0) {
            int newBornLastIndex = newBornList.size() - 1;
            int deletedLastIndex = deleteList.size() - 1;

            if (!newBornList.isEmpty() && !Zoo.animalList.contains(newBornList.get(newBornLastIndex)) &&
                    !Zoo.deleteList.contains(newBornList.get(newBornLastIndex))) {

                Zoo.animalList.add(newBornList.get(newBornLastIndex));
                // Yeni doğanları adlarıyla görmeyi sağlar.
                System.out.println(newBornList.get(newBornLastIndex).getName() + " yeni doğduğu için listeye eklendi.");
            }

            if (!(deleteList.isEmpty()) && Zoo.animalList.contains(deleteList.get(deletedLastIndex))) {

                Zoo.animalList.remove(deleteList.get(deletedLastIndex));
                // Avlanan hayvanları adlarıyla görmeyi sağlar.
                System.out.println(deleteList.get(deletedLastIndex).getName() + " avlandığı için listeden kaldırıldı.");
            }

            for (IAnimal animal : Zoo.animalList) {
                animal.makeInteraction(animalList);
                animal.move(animal.getX(), animal.getY());
                this.remainingMovement -= animal.getMobilityRange();
                this.remainingMovement = Math.max(0, remainingMovement);
                if (this.remainingMovement == 0) {
                    System.out.println("Kalan birim hareket miktarı: " + this.remainingMovement);
                    int population = Zoo.animalList.size();
                    System.out.println("Toplam hayvan nüfusu: " + population);
                    return;
                }
            }
        }
    }
}
