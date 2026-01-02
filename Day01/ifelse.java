import java.util.Scanner;

public class ifelse {

    public static void main(String[] args){
        // int n = 10;
        System.out.print("Enter an integer: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n==0) {
            System.out.println("\nPlease enter a non-zero integer");
        }
        else {
        if (n%2==0) {
            System.out.println("\n"+n+" is an Even number");
        } else {
            System.out.println("\n"+n+" is an Odd number");
        }
    }

        scanner.close();
    }
}

/* OUTPUT:
Enter an integer: 54

54 is an Even number


Enter an integer: 71

71 is an Odd number 
*/