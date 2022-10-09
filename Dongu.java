import java.util.Scanner;

public class Dongu {
    public static void main(String[] args) {
        int sayi, sum = 0;
        Scanner inp = new Scanner(System.in);
       /* System.out.println("sayi giriniz: ");
        sayi = inp.nextInt();
        if (sayi%4==0){
            sum=sayi;
        }
        while (sayi%2==0) {
            System.out.println("sayi giriniz: ");
            sayi = inp.nextInt();
            if (sayi % 4 == 0) {
            sum += sayi;
            }
        }
        System.out.println("girilen değerlerden çift ve 4'ün katları olan sayıların toplamı:"+sum);*/
        do {
            System.out.println("sayi giriniz: ");
            sayi = inp.nextInt();
            if (sayi % 4 == 0) {
                sum += sayi;
            }
        }while (sayi % 2 == 0) ;
        System.out.println("girilen değerlerden çift ve 4'ün katları olan sayıların toplamı:"+sum);
    }
}

