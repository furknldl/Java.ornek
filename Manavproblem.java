import java.util.Scanner;

public class Manavproblem {
    public static void main(String[] args) {
        double armutkg=2.14,elmakg=3.67,domateskg=1.11,muzkg=0.95,patlicankg=5.00;
        double armut,muz,patlican,elma,domates ;
        Scanner inp = new Scanner(System.in);
        System.out.print("Kac kilo armut aldiniz: ");
        armut = inp.nextDouble();
        System.out.print("Kac kilo elma aldiniz: ");
        elma= inp.nextDouble();
        System.out.print("Kac kilo domates aldiniz: ");
        domates = inp.nextDouble();
        System.out.print("Kac kilo muz aldiniz: ");
        muz = inp.nextDouble();
        System.out.print("Kac kilo patlican aldiniz: ");
        patlican = inp.nextDouble();
        double tutar;
        tutar=armut*armutkg+elma*elmakg+domates*domateskg+muz*muzkg+patlican*patlicankg;
        System.out.print("Toplam Tutar: "+tutar);

    }
}
