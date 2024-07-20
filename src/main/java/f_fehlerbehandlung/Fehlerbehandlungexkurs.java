package f_fehlerbehandlung;
import java.util.Scanner;

public class Fehlerbehandlungexkurs {
    public static void main(String[] args) {
        /*try
        {
            System.out.println("Lets, break the Universe: " + 7 / 0);
            System.out.println("test");
        } catch (ArithmeticException e)
        {
            System.out.println("Es ist durch 0 dividiert worden");
        }
        finally {
            System.out.println("Hallo");
        }*/

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number: ");
        String string = input.nextLine();
        input.close();



        try {
            Integer.valueOf(string);

            System.out.println("Der Wer ist eine Zahl! ");
        }

        catch (RuntimeException s){

            System.out.println("Der Wer ist keine Zahl! ");
        }


    }


}