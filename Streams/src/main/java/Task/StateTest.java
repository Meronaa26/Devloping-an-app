package Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class StateTest {
    public static void main(String[] args) {

     State va = new State();
        va.addCity("Mclean");
        va.addCity("Arligton");
        va.addCity("Fairfax");
        va.addCity("Fallchuruch");


        State tx = new State();
        tx.addCity("Dallas");
        tx.addCity("Plano");
        tx.addCity("Austin");
        tx.addCity(" Houston");


        List<State> list =Arrays.asList(va, tx);
         list.stream().map(state -> state.getCities()).forEach(System.out::println);
        System.out.println("************ANOTHER WAY*************");
         list.stream().map(st->st.getCities()).flatMap(Collection::stream).forEach(System.out::println);
    }
}
