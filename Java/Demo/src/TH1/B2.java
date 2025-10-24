package TH1;

import java.util.Scanner;

public class B2 {
         public static void main(String[] args)
     {
        int n;
        long dem=0;
        Scanner scan=new Scanner(System.in);
        System.out.print("nhap so nguyen duong n ");
        n=scan.nextInt();
        while(n>0)
        {dem++;
            n=n/10;

        }
        System.out.println("so chu so la"+ dem);
    }
}
