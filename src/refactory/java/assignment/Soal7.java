package refactory.java.assignment;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Soal7 {
    public static void main(String[] args){
        generateKabisat();
    }
    private static void generateKabisat(){
        List<Integer> range = IntStream.rangeClosed(2000, 2020)
                .boxed().collect(Collectors.toList());
        range.forEach(tahun ->{
            if (tahun % 4 == 0 && tahun % 100 != 0) {
                if (tahun % 400 == 0 && tahun % 100 == 0) {
                    System.out.println(tahun + " Tahun kabisat");
                }
                System.out.println(tahun + " Tahun kabisat");
            }else{
                System.out.println(tahun + " Bukan tahun kabisat");
            }
        });
    }
}
