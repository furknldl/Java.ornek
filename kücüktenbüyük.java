import java.util.Scanner;

public class kücüktenbüyük {
    public static void main(String[] args) {
        int a, b, c;
        Scanner inp = new Scanner(System.in);
        System.out.println("a sayisini giriniz: ");
        a = inp.nextInt();
        System.out.println("b sayisini giriniz: ");
        b = inp.nextInt();
        System.out.println("c sayisini giriniz: ");
        c = inp.nextInt();
        if (a < b && a < c) {
            System.out.println("a en buyuk sayidir");
            if (b < c) {
                System.out.println(a + "<=" + b + "<=" + c);
            } else {
                System.out.println(a + "<=" + c + "<="+b);
            }
        } if (b < a && b < c) {
            System.out.println("b en buyuk sayidir");
            if (a < c) {
                System.out.println(b +"<="+ a +"<=" +c);
            } else {
                System.out.println(b +"<="+ c +"<=" +a);
            }
        }
        if (c < a && c < b) {
            System.out.println("c en buyuk sayidir");
            if (a < b) {
                System.out.println(c +"<=" +a+ "<=" +b);
            } else {
                System.out.println(c +"<="+ b +"<="+ a);
            }
        }
    }
}
