import java.util.List;
import java.util.Random;

public class Rooster implements IAnimal {
    private int mobilityRange = 1;
    private int interactionRange = 3;
    private String species = "Rooster";
    private String gender;
    private int x;
    private int y;
    private String name;
    public static int count = 0;

    public Rooster(String gender, int x, int y) {
        this.gender = gender;
        this.name = "Rooster" + Rooster.count;
        this.x = x;
        this.y = y;
        Rooster.count++;
    }

    @Override
    public void makeInteraction(List<IAnimal> animal) {
        // Aynı hayvanlar tarafından birden
    }

    public int randomNumber() {
        Random random = new Random();
        int randomNumber = random.nextInt(2);
        return randomNumber;
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
