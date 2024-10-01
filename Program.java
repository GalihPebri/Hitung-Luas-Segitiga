import java.util.*;
import java.lang.Math;

public class Program {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int alas;
        int tinggi;
        double luas;

        System.out.println("masukkan alas : ");
        alas = input.nextInt();
        System.out.println("masukkan tinggi : ");
        tinggi = input.nextInt();

        luas = (alas * tinggi) * 0.5;
        System.out.println("Luas segitiga: " + luas);
    }
}
