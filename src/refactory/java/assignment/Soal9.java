package refactory.java.assignment;

import java.util.ArrayList;
import java.util.Arrays;

public class Soal9 {
    public static void main(String[] args) {
//        long countWords = countWords("lari pagi");
//        System.out.println(countWords);

//        String[] myArray = { "this", "is", "a", "sentence" };
//        String result = Arrays.stream(myArray)
//                .reduce("", (a,b) -> a + b);
//        System.out.println(result);
        characterLength("ilmiah");
        System.out.println("\n---\n");
        characterLength("lari pagi");
    }
//    public static long countWords(String words){
//        var list = new ArrayList(Arrays.asList(words.split("")));
//        return list.stream().count();
//    }
    private static void characterLength(String text){
        System.out.println("Input: " + text);
        var length = Arrays.stream(text.split(""))
                .map(Soal9::mapToOne)
                .reduce(0, Integer::sum);
        System.out.println("Output: " + length);
    }

    private static int mapToOne(String s) {
        return 1;
    }
}
