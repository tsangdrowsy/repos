package TH4.Polymorphorism;

public class Virtualdemo {
    public static void main(String[] args) {
        Salary s = new Salary(" Mohd Mohtashim", "Ambehta, UP", 3, 3600);
        Employee_Poly e = new Salary("John Adams","Boston,MA",2,2400);
        System.out.println("Call mailCheck using Salary reference --");
        s.mailCheck();
        System.out.println("\nCall mailCheck using Employee reference--");
        e.mailCheck();


    }
}
