package refactory.java.assignment;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class Soal10 {
    public static void main(String[] args) {
        intersection();
    }
    public static void intersection(){
        var numbers = List.of(3, 1, 7, 4, 5, 6, 8, 2);
        var indices = List.of(8, 7, 2, 8, 2, 6);

        var new_list = numbers.stream().filter(indices::contains).collect(Collectors.toList());
        System.out.println(new_list);
//        Set<Integer> result = new HashSet<>(numbers);
//        result.retainAll(indices);
//        System.out.println(result);
    }

}
