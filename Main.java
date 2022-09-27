import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Double mzk,fzk,mat,kmy,trk,trh,ort;

        Scanner inp = new Scanner(System.in);

        System.out.println("Fizik Notunuzu Giriniz: ");

        fzk = inp.nextDouble();

        System.out.println("Muzik Notunuzu Giriniz: ");

        mzk = inp.nextDouble();

        System.out.println("Matematik Notunuzu Giriniz: ");

        mat = inp.nextDouble();

        System.out.println("Kimya Notunuzu Giriniz: ");

        kmy = inp.nextDouble();

        System.out.println("Tarih Notunuzu Giriniz: ");

        trh= inp.nextDouble();

        System.out.println("Turkce Notunuzu Giriniz: ");

       trk = inp.nextDouble();

        ort = (fzk + mzk + mat + trh + kmy + trk)/6;

        System.out.println("Ortalamanız : " + ort);

        String str = (ort>=60) ? "gectiniz":"kaldiniz";

        System.out.println("\nDersten "+str);

    }
}