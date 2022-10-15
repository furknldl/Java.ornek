
import java.util.Scanner;

public class UsHesaplama {
    public static void main(String[] args) {
        int k , n , deger =1;
        Scanner inp  = new Scanner(System.in);
        System.out.println("Taban değerini giriniz: ");
        k = inp.nextInt();
        System.out.println("üs değerini giriniz: ");
        n = inp.nextInt();
        for (int i = 0 ; i<n;i++){          //
            deger *=k;
        }
        System.out.println(deger);
    }
}
