import java.util.Scanner;

public class daire {
    public static void main(String[] args) {
        double r,aci,pi=3.14;
        Scanner inp =new Scanner(System.in);

        System.out.println("Dairenin yaricapi: ");
        r = inp.nextDouble();

        double cevre,alan,dilimalani;
        cevre=2*pi*r;
        System.out.println("Dairenin cevresi: "+cevre);

        alan=pi*r*r;
        System.out.println("Dairenin Alani: "+alan);

        System.out.print("Alanini istediginiz daire diliminin acisi: ");
        aci=inp.nextDouble();

        dilimalani=(pi*(r*r)*aci)/360;
        System.out.println("Daire dilimin alanı: " +dilimalani);


    }
}
