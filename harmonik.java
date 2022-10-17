import java.util.Scanner;

public class harmonik {
    public static void main(String[] args) {
        int n;
        double toplam=0;
        Scanner inp = new Scanner(System.in);
        System.out.println("Bir sayi giriniz: ");
        n = inp.nextInt();
        for (int i = 1; i<=n; i++){
            toplam+=(1.0/i);
        }
        System.out.println(toplam);
    }
}
