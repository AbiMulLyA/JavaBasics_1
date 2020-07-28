package refactory.java.assignment;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Soal2 {
    public static void main(String[] args) {
//        List<Integer> generate = Soal2.generate(168);
//        System.out.println(generate);
        List<Integer> range = IntStream.rangeClosed(1, 1000)
                .boxed().collect(Collectors.toList());
        range.stream().filter(s ->{
            if (s<2) return false;
            for (int i = 2; i< s; i++){
                if(s % i == 0 ) return false;
            }
            return true;
        }).forEach(System.out::println );
    }
//    public static List<Integer> generate(int series) {
//        Set<Integer> set = new TreeSet<>();
//        return Stream.iterate(1, i -> ++i)
//                .filter(i -> i %2 != 0 ) // lambda expression
//                .filter(i -> {
//                    set.add(i);
//                    return 0 == set.stream()
//                            .filter(p -> p != 1)
//                            .filter(p -> !Objects.equals(p, i))
//                            .filter(p -> i % p == 0)
////                            .filter(p -> i < series)
//                            .count();
//                })
//                .limit(series)
//                .collect(Collectors.toList());
//    }
}
