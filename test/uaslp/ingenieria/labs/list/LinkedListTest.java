package uaslp.ingenieria.labs.list;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinkedListTest {
    //Given_When_Then

    @Test
    public void givenNewListIsEmpty(){
        //Given:
        //When:
        ArrayList<Integer> lista = new ArrayList<>();
        LinkedList<Integer> lista2 = new LinkedList<>();
        //Then:
        //Aserciones -> asserts
        assertEquals(0, lista.getSize());
        assertEquals(0, lista2.getSize());
    }
}
