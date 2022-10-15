import java.util.Scanner;

public class BasamakToplam {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int sayi,temp,basamakdeger,toplam=0;
        System.out.println("bir sayı giriniz: ");
        sayi = inp.nextInt();
        temp=sayi;
        while (temp!=0){
           basamakdeger=temp%10;
            toplam+=basamakdeger;
            temp/=10;

        }
        System.out.println("basamakların toplamı= "+toplam);
    }
}
