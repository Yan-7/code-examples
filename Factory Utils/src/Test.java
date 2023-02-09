public class Test {
    public static void main(String[] args) {
        int x = (int) (Math.random() * 10) + 0;
        int y = (int) (Math.random() * 11) + 5;

        int sal = FactoryUtils.init(5000,6000);

        int b = FactoryUtils.init(5, 15);
        int[]arr = FactoryUtils.init(70);

        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]+ " ");
        }
    }
}