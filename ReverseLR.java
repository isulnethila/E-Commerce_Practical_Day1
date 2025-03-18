import java.util.Scanner;
public class ReverseLR {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        for (int i = n / 2; i >= 1; i--) { 
            System.out.print(i + " "); 
        } 
        if (n % 2 != 0) {
            System.out.print((n / 2) + 1 + " ");
        }
         for (int i = n; i > (n / 2) + 1; i--) { 
            System.out.print(i + " "); 
        }
    }
}

