import java.util.Random;

public class arrayMod10
{
    public static void main(String[] args)
    {
        //Task 1--Declare the array of type int named dataPoints with a length of 100
        int[] dataPoints = new int[100];

        Random rnd = new Random();
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1;


    }
}