package class5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Set<String> hash_Set = new HashSet<String>();
        hash_Set.add("hello");
        hash_Set.add("hello"); // Yes, it is on purpose ( :
        Iterator<String> value = hash_Set.iterator();
        while (value.hasNext()) {
            System.out.println(value.next());
        }
    }
}
