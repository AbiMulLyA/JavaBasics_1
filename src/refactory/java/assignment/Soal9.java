package refactory.java.assignment;

import java.util.ArrayList;
import java.util.Arrays;

public class Soal9 {
    public static void main(String[] args) {
        long countWords = countWords("lari pagi");
        System.out.println(countWords);

//        String[] myArray = { "this", "is", "a", "sentence" };
//        String result = Arrays.stream(myArray)
//                .reduce("", (a,b) -> a + b);
//        System.out.println(result);
    }
    public static long countWords(String words){
        var list = new ArrayList(Arrays.asList(words.split("")));
        long result = list.stream().count();
        return result;
    }
}
