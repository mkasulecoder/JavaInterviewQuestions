package ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class VarietyArray {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        arrayList.add(10);
        arrayList.add("john");
        arrayList.add(true);
        arrayList.add(5.3);

        System.out.println(arrayList);

        // reverse the order of the array
        ArrayList reversed = new ArrayList();

        for (int i = arrayList.size() - 1; i >= 0; i--) {
            reversed.add(arrayList.get(i));
        }

        System.out.println(reversed);

        // remove true
        reversed.remove(true);
        reversed.add(2, "Added");
        reversed.add(1, true);

        System.out.println(reversed);
    }
}
