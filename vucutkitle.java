import java.util.Scanner;

public class vucutkitle {
    public static void main(String[] args) {
        double boy,kilo,endeks;
        Scanner inp = new Scanner(System.in);
        System.out.print("Boyunuzu (metre cinsinde) giriniz: ");
        boy = inp.nextDouble();
        System.out.print("Kilonuzu giriniz: ");
        kilo = inp.nextDouble();
        endeks=kilo/(boy*boy);
        System.out.println("Vucut kitle endeksiniz : "+endeks);


    }
}
