package generics.problema1;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PrintService<String> ps = new PrintService<>();
        PrintService<Integer> ps1 = new PrintService<>();

        System.out.print("How many values for String? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            String value = sc.next();
            ps.addValue(value);
        }

        ps.print();
        System.out.println("First: " + ps.fisrt());
        System.out.println();

        System.out.print("How many values for Integer? ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++){
            Integer value = sc.nextInt();
            ps1.addValue(value);
        }

        ps1.print();
        System.out.println("First: " + ps1.fisrt());

        sc.close();
    }
}
