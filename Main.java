import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> filter = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        //Отфильтруем положительные
        for (int num :
                array) {
            if (num >= 0){
                filter.add(num);
            }
        }

        //Отфильтруем четные
        for (int num :
                filter) {
            if ((num & 1) == 0){
                result.add(num);
            }
        }

        //Сортировка и вывод на экран
        Collections.sort(result);
        for (int num :
                result) {
            System.out.println(num);
        }
    }
}
