import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        (parameter1, parameter2) -> expression
//        (parameter1, parameter2) -> { code block }

//        List<Integer> myList = new ArrayList<>();
//        myList.add(1);
//        myList.add(5);
//        myList.add(3);
//        myList.forEach((n) -> System.out.println(n));
//
//        StringFunction cry = (s) -> s + "!";
//        StringFunction ask = (s) -> s + "?";
//        printFormatted("hello",cry);
//        printFormatted("hello",ask);

        Sayable s1 = (name) -> {
            return "hello " + name;
        };
        System.out.println(s1.say("Bob"));

        Addable a2 = (int a, int b) -> (a+b+100);
        System.out.println(a2.add(5,7));

        Sayable s1 = (name ) -> {
            
        }



//        --------------------
    }

    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);
    }

    interface StringFunction {
        String run(String str);
    }
    interface Drawable {
        public void draw();
    }
    interface Sayable {
        public String say(String name);
    }
    interface Addable {
        public int add(int a, int b);
    }
}
