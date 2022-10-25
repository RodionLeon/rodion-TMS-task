package lesson6;

import java.util.*;

public class CollectionTask1 {
    public static void main(String[] args) {
        String[] arr = new String[]{"Вика", "Родион", "3", "Родион", "2", "Родион", "1", "Родион", "2", "3", "4", "3", "4", "7"};
        List list = new ArrayList<>(List.of(arr));


        for (int i = 0; i < list.size(); i++) {
            if (Collections.frequency(list, list.get(i)) == 1) {
                list.remove(list.get(i));
            }
        }
        Set temp = new HashSet<>(list);
        List list3 = new ArrayList<>(temp);
        List res = new ArrayList<>();

        for (int i = 0; i <list3.size() ; i++) {
            int count = 0 ;
            for (int j = 0; j < list.size(); j++) {
                if(list3.get(i) ==list.get(j) ){
                    count ++;

                }
            }
            res.add(list3.get(i) + " = " + count);
        }

        System.out.println(res); // Вывод : [2 = 2, 3 = 3, 4 = 2, Родион = 4]
    }
}
