import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Dizi boyutunu giriniz : ");
        int array = scan.nextInt();

        int[] sayi = new int[array];


        for(int i = 0; i < sayi.length; i++){
            System.out.print((i+1) + ". elemanı giriniz: ");
            sayi[i] = scan.nextInt();

        }
        System.out.print("dizinin elemanları : " + Arrays.toString(sayi));
        Arrays.sort(sayi);
        System.out.println();
        System.out.print("sıralı dizi : " + Arrays.toString(sayi));



    }
}