import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Double tutar,kdv1=0.18,kdv2=0.08;

        Scanner inp = new Scanner(System.in);

        System.out.print("Tutari Giriniz: ");

        tutar = inp.nextDouble();

        boolean sonuc1 = (tutar<1000);

        System.out.print( sonuc1 ? "KDV Tutari :" +(tutar*kdv1) :"KDV Tutari :"+ (tutar*kdv2));

        System.out.print("\nKDV'li Tutar : ");

        System.out.println(sonuc1 ? (tutar+(tutar*kdv1)) : (tutar+(kdv2*tutar)));


    }
}