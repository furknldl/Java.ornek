import java.util.Scanner;

public class kombinasyon {
    public static void main(String[] args) {
        int sayi, nwithr, total = 1, total2 = 1, sayi2, total3 = 1;
        Scanner inp = new Scanner(System.in);
        System.out.println("Bir sayi giriniz: ");
        sayi = inp.nextInt();
        for (int i = 1; i <= sayi; i++) {
            total *= i;// i=1 n=5 1*2*3*4*5  i= i*i
        }
        System.out.println("ikinci sayiyi giriniz: ");
        sayi2 = inp.nextInt();
        for (int sayac = 1; sayac <= sayi2; sayac++) {
            total2 *= sayac;
        }
        for (int sayac = 1; sayac <= sayi - sayi2; sayac++) {
            total3 *= sayac;
        }
        nwithr = total / (total2 * total3);
        System.out.println("n in r li kombinasyonu: " + nwithr);
    }
}

