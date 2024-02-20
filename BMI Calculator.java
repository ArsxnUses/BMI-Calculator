import java.util.Scanner;

public class Main {
    
    static Scanner keyboard = new Scanner(System.in);
    
    static double enteredInches, enteredWeight, calcMeter, calcKilol, massIndex;

    public static void imperialEntry() {
        System.out.println("Welcome to the BMI Calculator");
        System.out.println("\nPlease enter your weight in pounds");
        enteredWeight = keyboard.nextDouble();
        System.out.println("\nPlease enter your height in inches");
        enteredInches = keyboard.nextDouble();
    }

    public static void weightConversion (double calcPound) {
        calcKilo = (calcPound * 453.59) / 1000;
    }
    
    public static void heightConversion (double calcInch) {
        calcMeter = (calcInch * 2.54) / 100;
    }

    public static void calculateIndex(double indexKilo, double indexMeter, double indexPound, double indexInch){
        massIndex = (indexKilo / (indexMeter * indexMeter));
    }

    public static void displayIndex(){
        System.out.printf("\nYou weigh %.2f pounds and measure %.2f inches", enteredWeight, enteredInches);
        System.out.printf("\nYou weigh %.2f kilograms and measure %.2f meters", calcKilo, calcMeter);
        System.out.printf("\nYour BMI is %.1f\n",massIndex);
    }

    public static void endMessage(){
        System.out.println("\nThank you for using the BMI Calculator");
    }

    public static void main(String []args){
        imperialEntry();
        weightConversion(enteredWeight);
        heightConversion(enteredInches);
        calculateIndex(calcKilo, calcMeter, enteredWeight, enteredInches);
        displayIndex();
        endMessage();
    }
}