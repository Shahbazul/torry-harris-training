import java.util.Scanner;

public class ReadNameDisplay {
    public static void main(String []args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number of times");
        int n=scan.nextInt();
        String name;
        name = scan.next();
        for (int i=0;i<n;i++) {
            System.out.println("name is " + name);
        }
    }
}
