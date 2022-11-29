package task1_2_3;// Написати метод, який приймає цілісний список та повертає цілий список тільки з непарними значеннями.


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OddList {

    static private List<Integer> oddList = new ArrayList<>();

    public OddList(List<Integer> list){

        Iterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()) {
            Integer temp = iterator.next();
            if((temp % 2) == 1) {
                oddList.add(temp);
            }
        }

    };

    public List<Integer> get(){
        return  oddList;
    }

}
