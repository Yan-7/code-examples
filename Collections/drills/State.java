package Collections.drills;

public class State {

    private String name;
    private int population;
    private String continent;
    private int size;

    public State(String name,  String continent) {
        this.name = name;
        this.population = (int) (Math.random()*100_000);
        this.continent = continent;
        this.size = (int) (Math.random()*100);
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public String getContinent() {
        return continent;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "State{" +
                "name='" + name + '\'' +

                ", size=" + size +
                '}';
    }
}
