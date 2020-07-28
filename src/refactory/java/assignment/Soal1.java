package refactory.java.assignment;

public class Soal1 {
//    protected int x = 64, y = 2;
    public static void main(String[] args) {
        System.out.println(penjumlahan(64, 2));
        System.out.println(pengurangan(64, 2));
        System.out.println(perpangkatan(64, 2));
        System.out.println(pengakaran(64));
        System.out.println(pembagian(64, 2));
        System.out.println(perkalian(64, 2));
    }
    public static int penjumlahan(int x, int y){
        int result = x + y;
        return result;
    }
    public static int pengurangan(int x, int y){
        int result = x - y;
        return result;
    }
    public static int perpangkatan(int x, int y){
        int result =(int) (Math.pow(x, y));
        return result;
    }
    public static int pengakaran(int x){
        int result =(int) (Math.sqrt(x));
        return result;
    }
    public static int pembagian(int x, int y){
        int result = x / y;
        return result;
    }
    public static int perkalian(int x, int y){
        int result = x * y;
        return result;
    }
}
