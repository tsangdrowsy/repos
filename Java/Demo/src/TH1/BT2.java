package TH1;

import java.util.Scanner;

public class BT2 {
    public static void main(String[] agrs) {
        float dai, rong;
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap vao chieu dai ");
        dai = scan.nextFloat();
        System.out.print("Nhap vao chieu rong ");
        rong = scan.nextFloat();
        System.out.print("Chu vi la " + (dai + rong) * 2 + "   ");
        System.out.print("Dien tich " + (dai * rong));
        int a, b, c;
        System.out.print("Nhap so a: ");
        a = scan.nextInt();
        System.out.print("Nhap so b: ");
        b = scan.nextInt();
        System.out.print("Nhap so c: ");
        c = scan.nextInt();

        int max = a;
        if (b > max)
            max = b;
        if (c > max)
            max = c;

        int min = a;
        if (b < min)
            min = b;
        if (c < min)
            min = c;

        System.out.println("So lon nhat la: " + max);
        System.out.println("So nho nhat la: " + min);
        int n;
        System.out.print("Nhap vao so nguyen duong n: ");
        n = scan.nextInt();
        System.out.print("Cac uoc cua " + n + " la: ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        int x;
        System.out.print("Nhap vao so nguyen duong x: ");
        x = scan.nextInt();
        int dem = 0;
        int tam = x;
        while (tam > 0) {
            dem++;
            tam /= 10;
        }
        System.out.println("So chu so cua " + x + " la: " + dem);

        scan.close();
    }
}
