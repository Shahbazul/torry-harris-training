import java.util.Scanner;

public class ArrayDemo1 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter number: ");
        int arr[]=new int[5];
        int n;
        for(int i=0,j=0;i<arr.length;i++){
            arr[i]=scan.nextInt();
            arr[j]=arr[i]*arr[i];
            j++;
        }
        for(int j=0;j<5;j++){
            System.out.println(arr[j]);
        }


    }
}
