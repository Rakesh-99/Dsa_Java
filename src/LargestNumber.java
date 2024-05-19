import java.util.Scanner;

public class LargestNumber
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the three numbers to find the largest number");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        int max = num1;

        if(num2 > max){
            max = num2;
        }
        if(num3 > max){
            max = num3;
        }

        System.out.println("The largest number is "+ max);

        scan.close();
    }
}