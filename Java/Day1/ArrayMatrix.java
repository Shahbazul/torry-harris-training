import java.util.Scanner;

public class ArrayMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr[][]=new int[3][3];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j]=scan.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]);;
            }
            System.out.println();
        }
    }
}
