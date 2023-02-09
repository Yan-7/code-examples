package L15_factoring;

public class InitCat {
    public static void main(String[] args) {
        Cat[] cats =null;
        cats = new Cat[10];

        cats = init(10);
    }
    public static Cat[] init(int len) {
        int count =1;
        Cat[] cats = new Cat[len];
        for (int i = 0; i <cats.length ; i++) {
            int id = count;
            String name = "mitzi"+count;
            int weight = (int) (Math.random()*15);
            cats[i] = new Cat(id,name,weight);
            count++;
        }
        return cats;
    }
    public static int avgWeight(Cat[] cats) {
        int sum =0;
        for (int i = 0; i < cats.length ; i++) {
            sum += cats[i].getWeight();
        }
        return sum/ cats.length;
    }
}
