import java.util.Random;


public class arrayMod10 {
    public static void main(String[] args) {
        //Task #1-- Declaring the array of type int named dataPoints with a length of 100
        int[] dataPoints = new int[100];
        //Task #2-- Initializing each element in dataPoints to a random value between 1 and 100.
        Random rnd = new Random();
        for (int i = 0; i < dataPoints.length; i++)
        {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }

        // Task #3-- Displaying the values of dataPoints and separating by "|"
        System.out.print("DataPoints: ");
        for (int i = 0; i < dataPoints.length; i++)
        {
            System.out.print(dataPoints[i]);
            if (i < dataPoints.length - 1)
            {
                System.out.print(" | ");
            }
        }
        System.out.println();

        //Task #4--Calculating and displaying the sum and average of dataPoints
        int sum = 0;
        for (int num : dataPoints)
        {
            sum += num;
        }
        double average = (double) sum / dataPoints.length;

        System.out.println("The sum of dataPoints: " + sum);
        System.out.printf("The average of dataPoints: %.2f%n", average);





    }
}
