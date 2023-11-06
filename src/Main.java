import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int[] dataPoints = new int[100];
        Random rnd = new Random();
        int sum = 0;
        double avg = 0;
        int min = dataPoints[99];
        int max = dataPoints[0];
        int count = 0;
        boolean done = false;

        int value = SafeInput.getRangedInt(in,"Pick a number between 1 and 100",1,100);


        for (int i = 1; i < dataPoints.length; i++)
        {
        dataPoints[i] = rnd.nextInt(100) + 1;
        System.out.printf("%3d ", dataPoints[i]);
        sum = sum + dataPoints[i];
            if (dataPoints[i] == value)
            {
            count ++;
            }

            if(dataPoints[i] < min)
                min = dataPoints[i];
            if(dataPoints[i] > max)
                max = dataPoints[i];

        }


    System.out.println("");
    System.out.println("Sum: " + sum);
    System.out.println("Average: " + getAverage(dataPoints));
    System.out.println("Number: " + value);
    System.out.println("Number Appeared: " + count + " times!");
    System.out.println("Min Number: " + min);
    System.out.println("Max Number: " + max);













    }

    public static double getAverage(int dataPoints[])
    {

        double sum = 0;
        double average = 0;

        for (int l=0; l < dataPoints.length; l++)
        {
            sum += dataPoints[l];
        }
        average = sum/ dataPoints.length;

        return average;
    }

    }


