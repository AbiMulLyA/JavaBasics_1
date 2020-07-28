package refactory.java.assignment;

import java.util.List;
import java.util.stream.Collectors;

public class Soal4 {
    public static void main(String[] args){
        var list = List.of("Aku", "bukanlah", "Superman", "Aku", "juga", "bisa", "nangis");
//        String result = String.join(" ", list);
//        System.out.println(result);

        System.out.println(list.stream()
                .distinct().collect(Collectors.joining(" ")));
    }
}
