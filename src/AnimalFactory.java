public class AnimalFactory {

    public IAnimal getShape(String shapeType, String gender, int x, int y) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("SHEEP")) {
            return new Sheep(gender, x, y);
        } else if (shapeType.equalsIgnoreCase("COW")) {
            return new Cow(gender, x, y);
        } else if (shapeType.equalsIgnoreCase("WOLF")) {
            return new Wolf(gender, x, y);
        } else if (shapeType.equalsIgnoreCase("CHICKEN")) {
            return new Chicken(gender, x, y);
        } else if (shapeType.equalsIgnoreCase("ROOSTER")) {
            return new Rooster(gender, x, y);
        } else if (shapeType.equalsIgnoreCase("LION")) {
            return new Lion(gender, x, y);
        } else if (shapeType.equalsIgnoreCase("HUNTER")) {
            return new Hunter(gender, x, y);
        }

        return null;
    }
}
