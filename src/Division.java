import java.util.IllegalFormatConversionException;
import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        try {
            //block of code that can throw exceptions
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Enter two numbers");
            int number = Integer.parseInt(keyboard.next());
            int secondNumber = Integer.parseInt(keyboard.next());
            double quotient = number / secondNumber;
            System.out.format("%d/%d=%f", number, secondNumber, quotient);
            keyboard.close();
        } /*catch (NumberFormatException nfe) {
            //Exception handler
            System.out.println("invalid number! :");
            System.out.println(nfe.getMessage());
            nfe.printStackTrace();
        } catch (ArithmeticException ae) {
            System.out.println("Division by 0");
            System.out.println(ae.getMessage());
        }*/
        catch (NumberFormatException|ArithmeticException e){
            //here "e" is of Throwable type that's why we cannot use methods of Exception class here.
            System.out.println("invalid number or Division by 0");
        }
        catch (IllegalFormatConversionException ifc){
            System.out.println("illegal format conversion");

        }
        System.out.println("The End");
    }
}
