package refactory.java.assignment;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Soal10 {
    public static void main(String[] args) {
        intersection();
    }
    public static void intersection(){
        var numbers = List.of(3, 1, 7, 4, 5, 6, 8, 2);
        var indices = List.of(8, 7, 2, 8, 2, 6);

        Set<Integer> result = new HashSet<>(numbers);
        result.retainAll(indices);
        System.out.println(result);
    }

}
