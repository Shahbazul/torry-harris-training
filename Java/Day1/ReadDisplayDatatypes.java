import java.util.Scanner;

public class ReadDisplayDatatypes {
    public static void main(String[] args) {
        System.out.println("Enter datatypes");
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        float f = scan.nextFloat();
        double d = scan.nextDouble();
        String s = scan.next();
        boolean bl = scan.nextBoolean();
        System.out.println(i);
        System.out.println(f);
        System.out.println(d);
        System.out.println(s);
        System.out.println(bl);
    }
}
