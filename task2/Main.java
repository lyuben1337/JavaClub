package task2;

/*2. Дано перелік рядків (можна взяти вірш, як варіант). Знайти кількість унікальних
рядків завдовжки більше 8 символів (можна варіювати в залежності від Вашого вхідного тексту).*/


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;



public class Main {

    interface UniqueLines {

        boolean isSuitableKey(String str);

        default int getCount(String text) {

            Map<String, Integer> map = new HashMap<>();
            int count = 0;

            String[] lines = text
                    .replace(",\n", "\n")
                    .replace(".\n", "\n")
                    .replace(";\n", "\n")
                    .replace("\n\n", "\n")
                    .split("\n");

            for (int i = 0; i < lines.length; i++) {

                if(!isSuitableKey(lines[i])) continue;

                if(!map.containsKey(lines[i])){
                    map.put(lines[i], 0);
                    count++;
                }

            }

            return count;
        }
    }

    public static void main(String[] args) {

        final String TEXT = """
                Ще не вмерла України, ні слава, ні воля,
                Ще нам, браття молодії, усміхнеться доля.
                Згинуть наші вороженьки, як роса на сонці,
                Запануєм і ми, браття, у своїй сторонці.
                
                Душу й тіло ми положим за нашу свободу,
                І покажем, що ми, браття, козацького роду.
                    
                Станем, браття, в бій кривавий від Сяну до Дону,
                В ріднім краю панувати не дамо нікому;
                Чорне море ще всміхнеться, дід Дніпро зрадіє,
                Ще у нашій Україні доленька наспіє.
                Душу й тіло ми положим за нашу свободу,
                І покажем, що ми, браття, козацького роду.
                                    
                А завзяття, праця щира свого ще докаже,
                Ще ся волі в Україні піснь гучна розляже,
                За Карпати відоб'ється, згомонить степами,
                України слава стане поміж народами.
                           
                Душу й тіло ми положим за нашу свободу,
                І покажем, що ми, браття, козацького роду.
                """;

        UniqueLines uniqueLines = (str -> str.length() < 40);

        System.out.println(uniqueLines.getCount(TEXT));



    }

}
