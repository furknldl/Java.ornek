import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {

        String sifre, gerceksifre = "dev", kullaniciadi;
        Scanner inp = new Scanner(System.in);
        System.out.println("Kullanici adinizi giriniz: ");
        kullaniciadi = inp.nextLine();
        System.out.println("sifrenizi giriniz: ");
        sifre = inp.nextLine();
        if (kullaniciadi.equals("p")) {
            if (sifre.equals(gerceksifre)) {
                System.out.println("girisiniz gerceklesmistir...");
            } else {
                System.out.println("Sifreniz yanlis...  Sifreyi sifirlamak ister misiniz?");
                String cevap = inp.nextLine();
                if (cevap.equals("evet")) {
                    System.out.println("yeni sifrenizi giriniz...");
                    String yenisifre = inp.nextLine();
                    if (yenisifre.equals(gerceksifre)) {
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz");
                    } else {
                        System.out.println("sifre olusturuldu ");
                        sifre = yenisifre;
                    }

                }
            }
        }
    }
}
