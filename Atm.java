import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String kullaniciadi, sifre;
        int hak = 3, secim;
        int bakiye = 2000;
        while (hak > 0) {
            System.out.print("kullanıcı adınızı giriniz: ");
            kullaniciadi = inp.nextLine();
            System.out.print("şifrenizi giriniz: ");
            sifre = inp.nextLine();
            if (kullaniciadi.equals("furkan") && sifre.equals("dal")) {
                System.out.println("Giriş başarılı, Hoşgeldiniz...");
                do {
                    System.out.println("1-para yatırma\n" +
                            "2-para çekme\n" +
                            "3-bakiye sorgulama\n" +
                            "4-çıkış yap");
                    System.out.print("lütfen yapmak istediğiniz işlemi seçiniz: ");
                    secim = inp.nextInt();
                    switch (secim) {
                        case 1:
                            System.out.println("para yatırma işlemini seçtiniz...");
                            System.out.print("yatıralacak para miktarı: ");
                            int paramiktari = inp.nextInt();
                            bakiye += paramiktari;
                            System.out.println("para yatırma işlemi tamamlandı...\nBakiyeniz: " + bakiye);
                            break;
                        case 2:
                            System.out.println("para çekme işlemini seçtiniz...");
                            System.out.print("çekilecek para miktarı: ");
                            paramiktari = inp.nextInt();
                            bakiye -= paramiktari;
                            System.out.println("para çekme işlemi tamamlandı...\nBakiyeniz: " + bakiye);
                            break;
                        case 3:
                            System.out.println("bakiye sorgulama işlemini seçtiniz...");
                            System.out.println("bakiyeniz: " + bakiye);
                            break;
                        case 4:
                            System.out.println("çıkış işleminiz başarılı...");
                            break;
                        default:
                            System.out.println("hatalı giriş yaptınız...");
                    }
                } while (secim < 4 && secim > 0);
                System.out.println("hatalı giriş yaptınız...");
                break;
            } else {
                System.out.println("Hatalı kullanıcı adı veya şifre.Tekrar giriş yapınız! ");
                System.out.println("Kalan hakkınız: " + --hak);
            }
        }
        if (hak == 0) {
            System.out.println("Hesabınız bloke olmuştur.Lütfen bankanız ile irtibata geçiniz...");
        }
    }
}