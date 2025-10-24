package TH1;

import java.util.ArrayList;
import java.util.Random;

public class B3 {
    public static void main(String[] args) {
        Random rd = new Random();

        
        ArrayList<Integer> ds = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int x = rd.nextInt(100);  
            ds.add(x);
            System.out.print(ds.get(i) + " ");
        }

        
        System.out.println("\nTrong ds có chứa số 50 không: " + ds.contains(50));

        
        int[] m1c = new int[10];
        for (int i = 0; i < m1c.length; i++) {
            m1c[i] = rd.nextInt(100);
            System.out.print(m1c[i] + " ");
        }

       
        boolean found = false;
        for (int i = 0; i < m1c.length; i++) {
            if (m1c[i] == 50) {
                found = true;
                break;
            }
        }
        System.out.println("\nTrong mảng có chứa số 50: " + found);
    }

}
