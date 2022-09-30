import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int sayi1, sayi2;
        int islem;
        Scanner inp = new Scanner(System.in);
        System.out.println("ilk sayiyi giriniz: ");
        sayi1 = inp.nextInt();
        System.out.println("ikinci sayiyi giriniz: ");
        sayi2 = inp.nextInt();
        System.out.println("(1/TOPLAMA 2/CİKARMA 3/CARPMA 4/BOLME) Yapmak istediginiz islemi giriniz: ");
        islem = inp.nextInt();

        switch (islem) {
            case 1:
                islem = (sayi1 + sayi2);
                System.out.println("islemin sonucu: " + "" + islem);
                break;
            case 2:
                islem = (sayi1 - sayi2);
                System.out.println("islemin sonucu: " + "" + islem);
                break;
            case 3:
                islem = (sayi1 * sayi2);
                System.out.println("islemin sonucu: " + "" + islem);
                break;
            case 4:
                islem = (sayi1 / sayi2);
                System.out.println("islemin sonucu: " + "" + islem);
                break;
            default:
                System.out.println("Hatali islem secimi!");

        }
    }
}
