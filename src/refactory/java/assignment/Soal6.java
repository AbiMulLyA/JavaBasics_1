package refactory.java.assignment;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Soal6 {
    public static void main(String[] args){
        generateList();
    }
    private static void generateList(){
        List<Integer> range = IntStream.rangeClosed(1, 1000)
                .boxed().collect(Collectors.toList());
        range.forEach(s ->{
            if(s%100 == 0){
                System.out.println(s + ". Kelipatan Seratus");
            }else if (s%2 == 1) {
                if(s%7 == 0){
                    System.out.println(s + ". Ganjil Kelipatan Tujuh");
                }else{
                    System.out.println(s + ". Ganjil");
                }
            }else if(s%2 == 0){
                if(s%8 == 0){
                    System.out.println(s + ". Genap Kelipatan Delapan");
                }else{
                    System.out.println(s + ". Genap");
                }
            }
        });
    }
}
