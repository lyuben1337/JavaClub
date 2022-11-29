package task1_2_3;/*1. Написати метод, який приймає цілісний список та повертає цілий список тільки з непарними значеннями.

2. Написати метод countUnique, який приймає цілісний список як параметр і повертає кількість унікальних цілих чисел у цьому списку.
При отриманні порожнього списку метод має повертати 0.
Приклад:
[3, 7, 3, -1, 2, 3, 7, 2, 15, 15] поверне 5.

3. Написати метод isUnique, який приймає Map&lt;String, String&gt;
і повертає true, якщо кожному ключу відповідають унікальне значення.
Наприклад, у цьому випадку повернеться true:

{Marty=Stepp, Stuart=Reges, Jessica=Miller, Amanda=Camp,
Hal=Perkins}
А в цьому false:
{Kendrick=Perkins, Stuart=Reges, Jessica=Miller, Bruce=Reges,
Hal=Perkins}

4. Скласти два багаточлени заданого ступеня, якщо коефіцієнти з багаточлени зберігаються в об'єкті HashMap у вигляді:
Ключ: номер ступеня
Значення: значення множника
Вивести результуючий багаточлен у вигляді рядка: ax^6 + bx^4 +
cx^3 + dx + 8
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
/*


public class task1_2_3.Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 6, 8, 9, 13, 20));
        task1_2_3.OddList oddList = new task1_2_3.OddList(list);
        System.out.println(oddList.get().toString());
    }
}*/

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 6, 8, 9, 13, 20, 3, 3, 4, 5, 5, 6, 20));
//        List<Integer> result = removeEven(list);
//        System.out.println(result);
        System.out.println(countUnique1(list));
        System.out.println(countUnique(list));
    }

    private static List<Integer> removeEven(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        for (Integer value : list) {
            if (value % 2 != 0) {
                result.add(value);
            }
        }
        return result;
    }



    private  static Integer countUnique1(List<Integer> list){

        List<Integer> uniqueNumbers = new ArrayList<>();
        for (Integer number : list) {
            if(!uniqueNumbers.contains(number)){
                uniqueNumbers.add(number);
            }
        }

        return  uniqueNumbers.size();
    }

    private static int countUnique(List<Integer> list) {
        return new HashSet<>(list).size();
    }

}


