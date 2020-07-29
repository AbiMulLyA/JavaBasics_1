package refactory.java.assignment;

import java.util.Collections;
import java.util.List;

public class Soal8 {
    public static void main(String[] args){
//        System.out.println(sumList());
        numberEight();
    }

//    public static Integer sumList(){
//        List<Integer> numbers = List.of(3, 1, 7, 4, 5, 6, 8, 2);
//        return numbers.stream()
//                .reduce(0, Integer::sum) - Collections.max(numbers);
//    }

    private static void numberEight(){
        var numbers = List.of(3, 1, 7, 4, 5, 6, 8, 2);
        var total = numbers.stream()
                .filter(item -> !item.equals(Collections.max(numbers)))
                .reduce(0, Integer::sum);
        System.out.println(total);
    }
}
