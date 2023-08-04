package Arrays;

import java.util.*;

public class AssociativeArray {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("Name", "Vanya");
        map.put("Last Name", "Maheshwari");
        System.out.println(map.size());
        Set<Map.Entry<String, String>> set = map.entrySet();
        List<Map.Entry<String, String>> list = new ArrayList<>(set);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getKey() + " " + list.get(i).getValue());
        }
    }
}
