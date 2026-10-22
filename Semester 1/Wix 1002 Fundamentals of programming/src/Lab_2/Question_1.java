import java.util.Scanner;


public class Question_1{
    public static void main(String[] args){
        try (Scanner keyboard = new Scanner(System.in)) {
            System.out.println("Input the Temperature in Fahrenheit : ");
            double Fahrenheit = keyboard.nextDouble();
            double Celsious = (Fahrenheit-32)*1.8;
            System.out.printf("The Temperature in Celsious is = %.2f", Celsious);
        }    
}
}