import java.util. Scanner;


public class calculator {

    public static void main(String[] args) {

        int number1, number2;
        String operator;

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen sayı giriniz");

        number1 = input.nextInt();
        number2 = input.nextInt();

        System.out.println("Lütfen seçmek istediğiniz operatorü giriniz");
        operator = input.next();

        switch (operator) {

            case "toplam":

                int hesap1 = number1 + number2;

                System.out.println(hesap1);

                break;

            case "cıkarma":

                int hesap2 = number1 - number2;

                System.out.println(hesap2);

                break;
            case "carpma":

                int hesap3 = number1 * number2;

                System.out.println(hesap3);

                break;

            case "bölme":

                int hesap4 = number1 / number2;

                System.out.println(hesap4);

                break;

            default:

                System.out.println("Lütfen başka bir operator deneyiniz");


        }

    }
}