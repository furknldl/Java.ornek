import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
        int yas, yolculuktipi;
        double km, ucret ;
        Scanner inp = new Scanner(System.in);
        System.out.println("Kac km yol gideceksiniz: ");
        km = inp.nextInt();
        System.out.println("Yolculuk tipiniz nedir (1/gidis 2/gidis-donus) :");
        yolculuktipi = inp.nextInt();
        System.out.println("Yasınız: ");
        yas = inp.nextInt();
        ucret = km * 0.1;
        if (yas > 0) {
            if (yas <= 12) {
               ucret -= ucret * 0.5;
            } else if ( yas < 24) {
                ucret -= ucret * 0.1;
            }else if (yas>65){
                ucret -= ucret*0.3;
            }
        }else {
            System.out.println("Hatali giris yaotiniz");
            return;
        }
        if (yolculuktipi >= 1 && yolculuktipi <= 2) {
            if (yolculuktipi == 2) {
                ucret -= ucret * 0.2;
            } else {
                System.out.println("sadece gidis yolculugunu tercih ettiniz");
            }
        } else {
            System.out.println("hatali giris yaptiniz");
            return;
        }
        System.out.println("Uçuş tutarınız: " +ucret+ " TL");
    }
}
