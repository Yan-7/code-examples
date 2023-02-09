package L15_enum;

public class Chair {
    private String color;
    private int numOfLegs;

    public Chair(Color color, int numOfLegs) {
        this.color = String.valueOf(color);
        this.numOfLegs = numOfLegs;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumOfLegs() {
        return numOfLegs;
    }

    public void setNumOfLegs(int numOfLegs) {
        this.numOfLegs = numOfLegs;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "color='" + color + '\'' +
                ", numOfLegs=" + numOfLegs +
                '}';
    }
}
