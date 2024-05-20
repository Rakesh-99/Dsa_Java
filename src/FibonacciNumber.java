import java.util.Scanner;

public class FibonacciNumber
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first nth fibonacci number");
        int fibNum = scan.nextInt();

        int prevIndex = 0;
        int nextIndex = 1;
        int res;


        for(int i = 1; i <= fibNum; i++)
        {
            res = prevIndex + nextIndex;
            prevIndex = nextIndex;
            nextIndex = res;

            System.out.println(res);

        scan.close();
        }

    }
}