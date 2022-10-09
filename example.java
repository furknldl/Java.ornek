import java.util.Scanner;

public class example {
    public static void main(String[] args) {
        int sayi;
        Scanner inp = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        sayi = inp.nextInt();
        System.out.println("4 ün kuvvetleri:");
        for (int i = 1; i <= sayi; i *= 4) {
            System.out.print(i + ",");
        }
        System.out.println("\n5 in kuvvetleri :");
        for (int i = 1; i <= sayi; i *= 5) {
            System.out.print(i + ",");
        }
    }
}
       /* while (i <= sayi) {
            i *= 4;
            if (sayi < i)
                break;
            System.out.println(i);
        }*/




