package TH1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BT3 {
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = 5;
        int[] mang = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu vao mang[" + i + "]: ");
            mang[i] = scan.nextInt();
        }
        System.out.println("Mang vua nhap:");
        for (int i = 0; i < n; i++) {
            System.out.print(mang[i] + " ");
        }
        System.out.println();

        n = 15;
        Random rd = new Random();
        int[] mang2 = new int[n];
        for (int i = 0; i < n; i++) {
            mang2[i] = rd.nextInt(100); // < 100
        }
        System.out.println("Mang ngau nhien:");
        for (int x : mang2) {
            System.out.print(x + " ");
        }
        System.out.println();

        System.out.println("Nhap 3 phan tu can them:");
        int[] mang3 = new int[mang2.length + 3];
        for (int i = 0; i < mang2.length; i++) {
            mang3[i] = mang2[i];
        }
        for (int i = mang2.length; i < mang3.length; i++) {
            System.out.print("Nhap phan tu thu " + (i - mang2.length + 1) + ": ");
            mang3[i] = scan.nextInt();
        }
        System.out.println("Mang sau khi them:");
        for (int x : mang3) {
            System.out.print(x + " ");
        }
        System.out.println();

        ArrayList<Integer> list = new ArrayList<>();
        for (int x : mang3) {
            if (x % 5 != 0) {
                list.add(x);
            }
        }
        System.out.println("Mang sau khi xoa boi cua 5:");
        for (int x : list) {
            System.out.print(x + " ");
        }
        System.out.println();

   
        System.out.print("Nhap so x can tim: ");
        int xFind = scan.nextInt();
        boolean found = false;
        for (int x : list) {
            if (x == xFind) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Tim thay " + xFind + " trong mang.");
        } else {
            System.out.println("Khong tim thay " + xFind + " trong mang.");
        }

        System.out.println("Cac phan tu co chu so hang chuc la 1:");
        for (int x : list) {
            int hangChuc = (x / 10) % 10;
            if (hangChuc == 1) {
                System.out.print(x + " ");
            }
        }
        System.out.println();
    }
}
