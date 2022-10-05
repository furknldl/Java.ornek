import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        int yil;
        Scanner inp = new Scanner(System.in);
        System.out.println("yıl giriniz: ");
        yil = inp.nextInt();
        if (yil % 4 == 0 && yil % 100 == 0 || yil % 400 == 0) {
            System.out.println(yil + " artik yildir");
        } else {
            System.out.println(yil + " artik yil degildir");
        }
    }
}



