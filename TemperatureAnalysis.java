//Imported Scanner class to read user input
import java.util.Scanner;

//Created class called TemperatureAnalysis with main method 
//Prompted the user to enter the number of days
public class TemperatureAnalysis {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of days:  ");
        int numDays = scanner.nextInt();
//Created array to store temperature and initialized sum to calculate total
        double[] temperatures = new double[numDays];
        double sum = 0;
//Used for loop to prompt user  enter temperature and adding to sum 
        for (int i = 0; i < numDays; i++) {
            System.out.print("Enter temperature for day " + (i + 1) + ": ");
            temperatures[i] = scanner.nextDouble();
            sum += temperatures[i];
        }
//Calculated average temperature 
        double averTemp = sum / numDays;
//Used for-each loop to count temperatures above average    
        int daysAboveAverage = 0;
        for (double temp : temperatures) {
            if (temp > averTemp) {
                daysAboveAverage++;
            }
        }
//This displayed results
        System.out.printf("Average temperature: %.2f\n", averTemp);
        System.out.println("Number of days above average: " + daysAboveAverage);


        scanner.close();
    }
}


