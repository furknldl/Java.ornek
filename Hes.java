import java.util.Scanner;
public class Hes {
    public static void main(String[] args) {

        int dik1,dik2;
        double hipo;

        Scanner inp = new Scanner(System.in);

        System.out.println("ilk dik kenari giriniz: ");

        dik1 =inp.nextInt();

        System.out.println("ikinci dik kenari giriniz: ");

        dik2 =inp.nextInt();

        hipo = Math.sqrt((dik1*dik1)+(dik2*dik2));

        System.out.println("hipotenus : "+hipo);

        double cevre,alan;

        cevre = dik1+dik2+hipo;

        System.out.println(" Ucgenin cevresi : "+cevre);

        alan=(dik1*dik2)/2;

        System.out.println("Ucgenin alanı: "+alan);


    }
}
