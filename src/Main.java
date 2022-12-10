// بسم الله الرحمن الرحيم

import java.util.Scanner;
public class Main
{
    public static boolean Dif_Of_MX_MN()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number of values");
        int n = in.nextInt();
        int mn = Integer.MAX_VALUE;
        int mx = Integer.MIN_VALUE;
        for (int i=0;i<n;i++)
        {
            System.out.println("enter the values");
            int x = in.nextInt();
            mn = Math.min(mn,x);
            mx = Math.max(mx,x);
        }

        if ((mx-mn) == 0) System.out.println(" Specail Case");
        if((mx-mn)<(mx/2))
            return true;
        else
            return false ;
    }

    public static void main(String[] args)
    {
        if (Dif_Of_MX_MN()==true)
            System.out.println("Dangerous Zone");
        else
            System.out.println("Safe Zone");
    }
}