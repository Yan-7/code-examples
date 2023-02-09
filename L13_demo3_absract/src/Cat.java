public class Cat extends Animal {

    private int numOflegs;

    public Cat(String name, int numOflegs) {
        super(name);
        this.numOflegs = numOflegs;
    }

    public int getNumOflegs() {
        return numOflegs;
    }

    public void setNumOflegs(int numOflegs) {
        this.numOflegs = numOflegs;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "numOflegs=" + numOflegs +
                '}' + super.toString();
    }

    @Override
    public void draw() {
    }

    @Override
    public void dinner() {
        System.out.println("mice");;
    }
}
