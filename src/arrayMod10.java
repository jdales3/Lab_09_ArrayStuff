import java.util.Random;

public class arrayMod10
{
    public static void main(String[] args)
    {
        //Task 1--Declare the array of type int named dataPoints with a length of 100
        int[] dataPoints = new int[100];

        // Task 2: Initialize each element in dataPoints to a random value between 1 and 100.
        Random rnd = new Random();
        for (int i = 0; i < dataPoints.length; i++)
        {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }
        // Task 3: Display the dataPoints values separated by " | ".
        System.out.print("DataPoints: ");
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i]);
            if (i < dataPoints.length - 1) {
                System.out.print(" | ");
            }
        }
        System.out.println();

        // Task 4: Calculate and display the sum and average of dataPoints.
        int sum = 0;
        for (int num : dataPoints) {
            sum += num;
        }
        double average = (double) sum / dataPoints.length;

        System.out.println("Sum of dataPoints: " + sum);
        System.out.printf("Average of dataPoints: %.2f%n", average);

        // *******  PART TWO  *********

        // Task 5: Prompt the user for an int value between 1 and 100.
        int userValue = SafeInput.getRangedInt("Enter a number between 1 and 100: ", 1, 100);

        // Task 6: Count how many times userValue appears in dataPoints.
        int count = 0;
        for (int num : dataPoints) {
            if (num == userValue) {
                count++;
            }
        }
        System.out.println("The value " + userValue + " appears " + count + " times in dataPoints.");

    }
}

