package task1;

// Дано список цілих чисел. Знайти середнє всіх непарних чисел, що діляться на 5.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface CountAverage {

    int setMultiplier(); // return 5;

    private  void getList(List<Integer> integerList, boolean isOdd){

        for (int i = 0; i < integerList.size(); i++) {
            if(integerList.get(i) % setMultiplier() != 0) {
                integerList.remove(i);
                i--;
                continue;
            }

            if(integerList.get(i) % 2 != (isOdd ? 1 : 0)) {
                integerList.remove(i);
                i--;
            }

        }
    };

    default double getAverage(List <Integer> integerList) {

        getList(integerList, true);

        System.out.println(integerList);

        int count = 0;
        int sum = 0;
        for (Integer number : integerList) {
            sum+=number;
            count++;
        }



        return (double)sum/count;
    }

}

public class Main {

    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>(Arrays.asList(11, 32, 25, 30, 5, 9, 40, 50, 45, 12, 5));

        CountAverage countAverage = () -> 5;

        System.out.println(countAverage.getAverage(integers)); // 20


    }
}
