import java.util.Scanner;

public class Rock {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 2 == 1) System.out.println("SK");
        else System.out.println("CY");

        sc.close();
    }

}
