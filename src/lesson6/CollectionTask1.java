package lesson6;

import java.util.*;

public class CollectionTask1 {
    public static void main(String[] args) {
        String[] arr = new String[]{"Вика", "Родион", "3", "Родион", "2", "Родион", "1", "Родион", "2", "3", "4", "3", "4", "7"};
        List list = new ArrayList<>(List.of(arr));
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            if (Collections.frequency(list, list.get(i)) == 1) {
                list.remove(list.get(i));
            }
        }
        System.out.println(list);
        for(int i=0;i<list.size();i++){
            int count = 0;
            count = Collections.frequency(list, list.get(i));
            map.put((String)list.get(i), count);
        }
        System.out.println(map);
    }
}
