
import org.example.ArrayList;
import org.junit.Test;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CollectionTest {
    @Test
    public void ArrayListTest() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrayList.add(i);
        }
        assertEquals(5, arrayList.size());
        arrayList.removeAt(0);
        arrayList.remove(3);
        assertEquals(3, arrayList.size());
        assertEquals(2, arrayList.get(1));

        for (Integer integer : arrayList) {
            System.out.println(integer);
        }

        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
