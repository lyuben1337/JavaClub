package task4;

import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(5, 2, 4, 2, 1);

        String result = "";

        for (int number:
                integerList) {
            result += Integer.toString(number);
        }

        System.out.println(result);

    }
}
