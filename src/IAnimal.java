import java.util.List;

public interface IAnimal {
    public void move(int x, int y);

    public void makeInteraction(List<IAnimal> animal);

    public int getMobilityRange();

    public String getName();

    public int getX();

    public int getY();

    public String getSpecies();

    public String getGender();
}
