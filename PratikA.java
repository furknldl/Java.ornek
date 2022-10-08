import java.util.Scanner;

public class PratikA {
    public static void main(String[] args) {
       /* int i, sayi;
        Scanner inp = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        sayi = inp.nextInt();
        for (i = 0; i <= sayi; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }*/
        int k;
        Scanner inp = new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        k = inp.nextInt();
        for (int i = 1; i <= k; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                System.out.println(i);
            }
        }
    }
}
