public class ForEach {
    public static void main(String[] args) {
        int K=1;
        for (int i=1;i<=5;i++)
        {
            for(int j=1;j<=i+1;j++)
            {
                System.out.print(K++ + " ");
            }
            System.out.println();
        }
    }
}
