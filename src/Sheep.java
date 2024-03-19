import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sheep implements IAnimal {
    private int mobilityRange = 2;
    private int interactionRange = 3;
    private String species = "Sheep";
    private String gender;
    private int x;
    private int y;
    private String name;
    public static int count = 0;
    private ArrayList<String> ex = new ArrayList<>();

    public Sheep(String gender, int x, int y) {
        this.gender = gender;
        this.name = "Sheep" + Sheep.count;
        this.x = x;
        this.y = y;
        Sheep.count++;
    }

    @Override
    public void makeInteraction(List<IAnimal> animal) {
        for (int j = 0; j < animal.size(); j++) {
            IAnimal otherAnimal = animal.get(j);
            if ((otherAnimal.getSpecies().equals("Sheep") &&
                    !otherAnimal.getName().equals(this.name))
                    && (otherAnimal.getGender().equals("female") && this.gender.equals("male"))
                    && (!ex.contains(otherAnimal.getName()) && !Zoo.newBornList.contains(otherAnimal)
                            && !Zoo.newBornList.contains(this))) {
                double distance = Math.sqrt(Math.pow(this.x - otherAnimal.getX(), 2) +
                        Math.pow(this.y - otherAnimal.getY(), 2));
                if (distance <= 3) {
                    System.out.println(
                            this.name + " isimli " + this.gender + " hayvan " + otherAnimal.getName()
                                    + " isimli " + otherAnimal.getGender() + " hayvan ile çiftleşti.");
                    App.zoo.addNewBorn("Sheep", randomGender(), this.x, this.y);
                    ex.add(otherAnimal.getName());
                    break;
                }
            }
        }
    }

    public String randomGender() {
        Random random = new Random();
        String[] genders = { "male", "female" };
        String randomGender = genders[random.nextInt(genders.length)];
        return randomGender;
    }

    @Override
    public void move(int x, int y) {
        Random random = new Random();
        this.y += (random.nextInt(2) * 2 - 1) * mobilityRange;
        this.x += (random.nextInt(2) * 2 - 1) * mobilityRange;

        this.x = Math.max(0, Math.min(this.x, 499));
        this.y = Math.max(0, Math.min(this.y, 499));
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getMobilityRange() {
        return mobilityRange;
    }

    public void setMobilityRange(int mobilityRange) {
        this.mobilityRange = mobilityRange;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getInteractionRange() {
        return interactionRange;
    }

    public void InteractionRange(int interactionRange) {
        this.interactionRange = interactionRange;
    }
}
