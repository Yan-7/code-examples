package Collections.drills;

import java.util.*;

public class B {
    public static void main(String[] args) {

        State s1 = new State("Israel","Asia");
        State s2 = new State("A","Asia");
        State s3 = new State("B","America");
        State s4 = new State("Senegal","Africa");
        State s6 = new State("Zaudi Arabia","Asia");
        State s5 = new State("Maliasia","Asia");

        ArrayList<State> states = new ArrayList<>();
        ArrayList<State> statesContinent = new ArrayList<>();
        ArrayList<State> statesSize  = new ArrayList<>();

        states.add(s1);
        states.add(s2);
        states.add(s3);
        states.add(s4);
        states.add(s5);
        states.add(s6);

        statesSize.addAll(states);
        System.out.println(states);
        System.out.println( );
//        Collections.sort(states,); // TODO: 08/08/2022
        Iterator<State> iterator = states.iterator();
        System.out.println(states);

    }
}
