import java.util.Scanner;
public class codemind{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int ans;
        ans=(n*(n+1))/2;
        System.out.print(ans);
        
    }
}