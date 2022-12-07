package task3;

import java.util.HashMap;
import java.util.Map;

public class Main {

    interface SumByKeys {

        boolean isSuitableKey(String str);

        default int sum (Map<String, Integer> map) {

            int sum = 0;

            for (String str:
                 map.keySet()) {

                if(isSuitableKey(str)){
                    sum += map.get(str);
                }

            }

            return sum;
        }

    }

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        String [] strings = {"aaaaaaxxxxx", "bcd", "qwe", "zxc1231337", "xyz111"};
        Integer [] integers = {5, 10, -2, 11, 5};

        for (int i = 0; i < 5; i++) {
            map.put(strings[i], integers[i]);
        }

        System.out.println(map);

        SumByKeys sumByKeys = (str -> str.length() < 7);

        System.out.println(sumByKeys.sum(map));


    }
}
