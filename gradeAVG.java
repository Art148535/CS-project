import java.util.Scanner;
public class gradeAVG {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //this is where we ask the user to tell us how many grades to calculate
        System.out.println("Please enter how many grades you have");
        int e = sc.nextInt();
        //this here is the variable outside the loop to keep the value of the grade that we added together
        double sum = 0;
        //this for loop is the logic to ask the user for the grades and sum them up the reason for the for loop is because there could be more than just a set of grades
        for (int i = 0; i < e; i++){
            System.out.println("please enter grade nr." + (i + 1));
            double grade = sc.nextInt();
            sum = sum + grade;
        }
        //System.out.println(sum); - this line of code was used to debug
        // and this is the part we calculate the final and display to the user 
        double finalSum = sum/e;
        //in this block code i made some if else logic to see if the users grade is very good, good, or a fail
        String SEKBOSC = "";
        if (finalSum >= 5) {
            SEKBOSC = "Excellent";
        } else if (1 < finalSum && finalSum < 5){
            SEKBOSC = "Acceptable";
        } else {
            SEKBOSC = "Failure";
        }
        System.out.println("your grade average is " + finalSum + " " + SEKBOSC);
        sc.close();
    }
}
