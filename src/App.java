public class App {

    public static Zoo zoo = new Zoo(500, 500);

    public static void main(String[] args) {

        zoo.addAnimals("Wolf", 5, "female");
        zoo.addAnimals("Wolf", 5, "male");
        zoo.addAnimals("Cow", 5, "female");
        zoo.addAnimals("Cow", 5, "male");
        zoo.addAnimals("Chicken", 10, "female");
        zoo.addAnimals("Rooster", 10, "male");
        zoo.addAnimals("Sheep", 15, "male");
        zoo.addAnimals("Sheep", 15, "female");
        zoo.addAnimals("Human", 1, "male");
        zoo.addAnimals("Lion", 4, "female");
        zoo.addAnimals("Lion", 4, "male");

        zoo.simulate();

    }
}
