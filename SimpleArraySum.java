import java.util.*;
public class SimpleArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
        int n,i;
        int[]a=new int[10];
        System.out.println("Enter the no of entries");
        n=s.nextInt();
        System.out.println("Enter the entries");
        for(i=0;i<n;i++)
            a[i]=s.nextInt();
        int sum=0;
        for(i=0;i<n;i++)
            sum=sum+a[i];
        System.out.println("Sum is"+sum);
    

	}

}
