import java.util.Scanner;

public class burcyorum {
    public static void main(String[] args) {
        int gun, ay;
        Scanner inp = new Scanner(System.in);
        System.out.println("Dogdugunuz ayi (1-12) sayi cinsinden belirtiniz: ");
        ay = inp.nextInt();
        System.out.println("Dogdugunuz gunu belirtiniz: ");
        gun = inp.nextInt();
        if (ay == 1) {
            if (gun > 0 && gun <= 21) {
                System.out.println("Oglak burcusunuz");
            } else if (gun > 21 && gun <= 31) {
                System.out.println("kova burcusunuz");
            } else {
                System.out.println("ocak ayi 31 gunden olusmaktadir");
            }
        }
        if (ay == 2) {
            if (gun > 0 && gun <= 19) {
                System.out.println("Kova burcusunuz");
            } else if (gun > 19 && gun <= 28) {
                System.out.println("Balik burcusunuz");
            } else {
                System.out.println("Subat ayi 28 gunden olusmaktadir");
            }
        }
        if (ay == 3) {
            if (gun > 0 && gun <= 20) {
                System.out.println("Balik burcusunuz");
            } else if (gun > 20 && gun <= 31) {
                System.out.println("Koc burcusunuz");
            } else {
                System.out.println("Mart ayi 31 gunden olusmaktadir");
            }
        }
        if (ay == 4) {
            if (gun > 0 && gun <= 20) {
                System.out.println("Koc burcusunuz");
            } else if (gun > 20 && gun <= 30) {
                System.out.println("Boga burcusunuz");
            } else {
                System.out.println("Nisan ayi 30 gunden olusmaktadir");
            }
        }
        if (ay == 5) {
            if (gun > 0 && gun <= 21) {
                System.out.println("Boga burcusunuz");
            } else if (gun > 21 && gun <= 31) {
                System.out.println("ikizler burcusunuz");
            } else {
                System.out.println("mayis 31 gunden olusmaktadir");
            }
        }
        if (ay == 6) {
            if (gun > 0 && gun <= 22) {
                System.out.println("ikizler burcusunuz");
            } else if (gun > 22 && gun <= 30) {
                System.out.println("Yengec burcusunuz");
            } else {
                System.out.println("Haziran ayi 30 gunden olusmaktadir");
            }
        }
        if (ay == 7) {
            if (gun > 0 && gun <= 22) {
                System.out.println("Yengec burcusunuz");
            } else if (gun > 22 && gun <= 31) {
                System.out.println("Aslan burcusunuz");
            } else {
                System.out.println("Temmuz ayi 31 gunden olusmaktadir");
            }
        }
        if (ay == 8) {
            if (gun > 0 && gun <= 22) {
                System.out.println("Aslan burcusunuz");
            } else if (gun > 22 && gun <= 31) {
                System.out.println("Basak burcusunuz");
            } else {
                System.out.println("Agustos 31 gunden olusmaktadir");
            }
        }
        if (ay == 9) {
            if (gun > 0 && gun <= 22) {
                System.out.println("Basak burcusunuz");
            } else if (gun > 22 && gun <= 30) {
                System.out.println("Terazi burcusunuz");
            } else {
                System.out.println("Eylul ayi 30 gunden olusmaktadir");
            }
        }
        if (ay == 10) {
            if (gun > 0 && gun <= 22) {
                System.out.println("Terazi burcusunuz");
            } else if (gun > 22 && gun <= 31) {
                System.out.println("Akrep burcusunuz");
            } else {
                System.out.println("Ekim ayi 31 gunden olusmaktadir");
            }
        }
        if (ay == 11) {
            if (gun > 0 && gun <= 21) {
                System.out.println("Akrep burcusunuz");
            } else if (gun > 21 && gun <= 30) {
                System.out.println("Yay burcusunuz");
            } else {
                System.out.println("Kasim ayi 30 gunden olusmaktadir");
            }
        }
        if (ay == 12) {
            if (gun > 0 && gun <= 21) {
                System.out.println("Yay burcusunuz");
            } else if (gun > 21 && gun <= 31) {
                System.out.println("Oglak burcusunuz");
            } else {
                System.out.println("Aralik ayi 31 gunden olusmaktadir");
            }
        }
    }
}