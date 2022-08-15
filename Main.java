import java.util.Scanner;
class PrimeCheck
{
    public static void main(String args[])
    {
        int number;
        boolean isPrime=true;
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter any number:");

        int num=scan.nextInt();
        scan.close();
        for(int i=2;i<=num/2;i++)
        {
           number=num%i;
            if(number==0)
            {
                isPrime=false;
                break;
            }
        }

        if(isPrime)
            System.out.println(num + " is a Prime Number");
        else
            System.out.println(num + " is not a Prime Number");
    }
}