//this is just where i imported scanner tool
import java.util.Scanner;
public class project {
    public static void main(String[] args){
        //Here i made a scanner tool so we could get user input so we know if wer converting C or F
        Scanner input = new Scanner(System.in);
        System.out.println("Heat unit coverter");
        System.out.println("Enter C/F for celcius or fahrenheit");
        String choice = input.nextLine();
        /*Here i made a simple if else logic if they enter F,f it would tell us wer converting celsuis to fahranhiet or if they entered
         C,c it would tell us wer converting fahrenheit to celsuis*/
        if (choice.equalsIgnoreCase("F")){
            System.out.println("Please enter celsius");
            double celcius = input.nextDouble();
            double CoFharenheit = (celcius * 9/5) + 32;// this is the formula for converting celcius to fahranhiet
            System.out.println("The converted celcius is " + CoFharenheit + "F°");
        }else {
            System.out.println("Please enter fahrenheit");
            double fahrenheit = input.nextDouble();
            double CoCelsius = (fahrenheit - 32) * 5/9;// this is the formula for converting fahrenheite to celsiuse
            System.out.println("The converted fahrenheit is " + CoCelsius + "C°");
        }

    }
}
