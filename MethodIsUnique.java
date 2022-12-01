import java.util.*;

public class MethodIsUnique {

    /*Написати метод isUnique, який приймає Map&lt;String, String&gt;
і повертає true, якщо кожному ключу відповідають унікальне значення.
Наприклад, у цьому випадку повернеться true:
*/



    public static boolean isUnique(Map<String, String> map) {


        ArrayList<String> values = new ArrayList<>();



        for (String i : map.keySet()) {
            values.add(map.get(i));
        }

        for(int i = 0; i < values.size() - 1; i++){

            for (int j = i + 1; j < values.size(); j++) {

                if(values.get(i).equals(values.get(j))){
                    return false;
                }

            }
        }

        return true;

    }

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("A", "321");
        map.put("B", "313");
        map.put("C", "333");

        System.out.println(isUnique(map));

    }
}