import java.util.ArrayList;
import java.util.Iterator;

/*
Создать список типа ArrayList<String>.
Поместить в него как строки, так и целые числа.
Пройти по списку, найти и удалить целые числа.
 */
public class FifthProblem {
    public void stringsAndNums(){
        ArrayList<String> myList = new ArrayList<>();
        ArrayList<String> list = new ArrayList<>();
        myList.add("q");
        myList.add("w");
        myList.add(String.valueOf(5));
        myList.add("e");
        myList.add("r");
        myList.add(String.valueOf(100));
        myList.add("t");
        myList.add("y");
        myList.add(String.valueOf(3));
        myList.add(String.valueOf(2));

        System.out.println("Было: " + myList);
        // I - способ
//        Iterator<String> iterator = myList.iterator();
//        while (iterator.hasNext()) {
//            String next = iterator.next();
//            if (next.matches("-?\\d+(\\.\\d+)?")) {
//                iterator.remove();
//            }
//        }
//        System.out.println("Стало: " + myList);

        Iterator<String> iterator = myList.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            try {
                Integer.parseInt(next);
            } catch (NumberFormatException numberFormatException) {
                list.add(next);
            }
        }
        System.out.println("Стало: " + list);
    }
}
