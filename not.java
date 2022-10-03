import java.net.SecureCacheResponse;
import java.util.Scanner;

public class not {
    public static void main(String[] args) {
        int muzik, fizik, turkce, kimya, mat, toplam = 0, dersSayisi = 0;
        double ort;
        Scanner inp = new Scanner(System.in);
        System.out.println("Müzik notunuzu giriniz: ");
        muzik = inp.nextInt();
        if (muzik >= 0 && muzik <= 100) {
            toplam += muzik;
            dersSayisi++;
        }
        System.out.println("Fizik notunuzu giriniz: ");
        fizik = inp.nextInt();
        if (fizik >= 0 && fizik <= 100) {
            toplam += fizik;
            dersSayisi++;
        }
        System.out.println("Türkçe notunuzu giriniz: ");
        turkce = inp.nextInt();
        if (turkce >= 0 && turkce <= 100) {
            toplam += turkce;
            dersSayisi++;
        }
        System.out.println("Kimya notunuzu giriniz: ");
        kimya = inp.nextInt();
        if (kimya >= 0 && kimya <= 100) {
            toplam += kimya;
            dersSayisi++;
        }
        System.out.println("Matematik notunuzu giriniz: ");
        mat = inp.nextInt();
        if (mat >= 0 && mat <= 100) {
            toplam += mat;
            dersSayisi++;
        }
        ort = toplam / dersSayisi;
        System.out.println("ortalamaniz: " + ort);


    }
}
