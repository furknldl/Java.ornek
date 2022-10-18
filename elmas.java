import java.util.Scanner;

// while ile yapmak pratikleştirir

public class elmas {
    public static void main(String[] args) {
        int n;
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        n = inp.nextInt();
        for (int i = 1; i <= n; i++) {                   //Kaç basamak yıldız yazacağımızı bu döngüyle yapıyoruz örnek olarak 6 basamaklı yıldız kümesi için n yerine 6 yazmalıyız.
            for (int j = 1; j <= (n - i); j++) {        //Burada ise başında bıraktığımız boşlukları belirtmek için döngü kullandık.
                System.out.print(" ");                 // Baktığımızda her zaman n sayısından i kadar eksik boşluk oluşuyor o yüzden koşul kısmına n-i yazdık.
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {          //buradaki 2i-1 kaç yıldız yazıcağımızı belirlemek adına yapılmış bir işlemdir.
                System.out.print("*");
            }
            System.out.println();                           // döngü sonunda bir alt satıra inmemizi sağlıyor.
        }
        for (int x = (n - 1); x >= 1; x--) {
            for (int y = 1; y <= (n - x); y++) {
                System.out.print(" ");
            }
            for (int z = 1; z <= (2 * x) - 1; z++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
