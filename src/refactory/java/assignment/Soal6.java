package refactory.java.assignment;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Soal6 {
    public static void main(String[] args){
//        generateList();
        numberSix();
    }
//    private static void generateList(){
//        List<Integer> range = IntStream.rangeClosed(1, 1000)
//                .boxed().collect(Collectors.toList());
//        range.forEach(s ->{
//            if(s%100 == 0){
//                System.out.println(s + ". Kelipatan Seratus");
//            }else if (s%2 == 1) {
//                if(s%7 == 0){
//                    System.out.println(s + ". Ganjil Kelipatan Tujuh");
//                }else{
//                    System.out.println(s + ". Ganjil");
//                }
//            }else if(s%2 == 0){
//                if(s%8 == 0){
//                    System.out.println(s + ". Genap Kelipatan Delapan");
//                }else{
//                    System.out.println(s + ". Genap");
//                }
//            }
//        });
//    }
    private  static void numberSix(){
        IntStream.rangeClosed(1, 1000)
                .boxed().map(Soal6::mapToEvenOrOdd)
                .forEach(System.out::println);
    }
    private static String mapToEvenOrOdd(int number){
        if(number%100 == 0){
            return number + ". Kelipatan Seratus";
        }else if (number%2 == 1) {
            if(number%7 == 0){
                return number + ". Ganjil Kelipatan Tujuh";
            }else{
                return number + ". Ganjil";
            }
        }else if(number%2 == 0){
            if(number%8 == 0){
                return number + ". Genap Kelipatan Delapan";
            }else{
                return number + ". Genap";
            }
        }
        return "test";
    }
}
