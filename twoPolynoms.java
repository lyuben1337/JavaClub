import java.util.*;

public class twoPolynoms {

    /*Сложить два многочлена заданной степени, если коэффициенты
многочлена хранятся в объекте HashMap в виде:
Ключ: номер степени
Значение: значение множителя
Вывести результирующий многочлен в виде строки: ax^6 + bx^4 +
cx^3 + dx + 8
*/

    public static Map<Integer, Integer> sum(Map<Integer, Integer> map1, Map<Integer, Integer> map2){

        Map<Integer, Integer> polynom = new HashMap<>();

        for (Integer i: map1.keySet()) {
            polynom.put(i, map1.get(i) + map2.get(i));
        }

        return polynom;
    }

    public static void output(Map<Integer, Integer> map){

        List<Integer> keys = map.keySet().stream().toList();
        List<Integer> values = map.values().stream().toList();

        for (int i = keys.size() - 1; i >= 0; i--) {

            if(values.get(0) == 0) continue;
            if(i == 0) System.out.print(values.get(i));
            else if (i == 1)  System.out.print(values.get(i) + "x" + " + ");
            else System.out.print(values.get(i) + "x^" + keys.get(i) + " + ");

        }

    }

    public static void main(String[] args) {

        Map<Integer, Integer> polynom1 = new HashMap<>();

        int [] coefficients1 = {3, 1, 5, 2, 6};
        int [] coefficients2 = {6, 2, 7, 4, 3};

        int degree = 4;

        for (int i = degree; i >= 0; i--) {
            polynom1.put(i, coefficients1[i]);
        }

        Map<Integer, Integer> polynom2 = new HashMap<>();

        for (int i = degree; i >= 0; i--) {
            polynom2.put(i, coefficients2[i]);
        }

        Map<Integer, Integer> polynom = sum(polynom1, polynom2);

        System.out.println(polynom);
        output(polynom);

    }
}