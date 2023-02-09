public class Dog extends Animal {

    private boolean isNice;

    public Dog(String name, boolean isNice) {
        super(name);
        this.isNice = isNice;
    }

    public boolean isNice() {
        return isNice;
    }

    public void setNice(boolean nice) {
        isNice = nice;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "isNice=" + isNice +
                '}';
    }

    @Override
    public void draw() {
    }

    @Override
    public void dinner() {
        System.out.println("bonzo");;
    }
}
