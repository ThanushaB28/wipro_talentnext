package wipro_talentnext;
import java.util.Scanner;
public class four {
	public static void main(String[] args)
	{
	Scanner f = new Scanner(System.in);
	int i=f.nextInt();
	if(i>0)
	System.out.println("This is positive number");
	else if (i<0)
	System.out.println("This is negative number");
	else
	System.out.println("Its Zero");
}
}