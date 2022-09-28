import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args) {
        double kmbasi=2.20,tutar,km,acilis=10;

        Scanner inp = new Scanner(System.in);

        System.out.println("Kac km yol aldiniz : ");

        km =inp.nextDouble();

        tutar = acilis+kmbasi*km;

        tutar=(tutar<20) ? 20 : tutar;

        System.out.println("Toplam  tutar: "+ tutar);




    }


}
