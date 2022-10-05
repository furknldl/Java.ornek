import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {
        int birthdate, residual;
        String horoscope = "";
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the birthdate : ");
        birthdate = inp.nextInt();
        residual = birthdate % 12;
        switch (residual) {
            case 0:
                horoscope = "monkey";
                break;
            case 1:
                horoscope = "cockerel";
                break;
            case 2:
                horoscope = "dog";
                break;
            case 3:
                horoscope = "pig";
                break;
            case 4:
                horoscope = "mouse";
                break;
            case 5:
                horoscope = "ox";
                break;
            case 6:
                horoscope = "tiger";
                break;
            case 7:
                horoscope = "rabbit";
                break;
            case 8:
                horoscope = "dragon";
                break;
            case 9:
                horoscope = "snake";
                break;
            case 10:
                horoscope = "horse";
                break;
            case 11:
                horoscope = "sheep";
                break;
            default:
                System.out.println("enter wrong number");
        }
        System.out.println("your horoscope is " + horoscope);
    }
}
