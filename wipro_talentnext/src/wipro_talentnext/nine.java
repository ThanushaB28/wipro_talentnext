package wipro_talentnext;
import java.util.Scanner;
public class nine {
	void meth1()
	{
	Scanner Sc=new Scanner(System.in);
	int n=Sc.nextInt();
	for(int i=1;i<=n;i++)
     {
	for(int j=1;j<=i;j++)
	System.out.print("*");
	System.out.println();
     }
	}
	public static void main(String args[])
     {
	new nine().meth1();
     }

}
