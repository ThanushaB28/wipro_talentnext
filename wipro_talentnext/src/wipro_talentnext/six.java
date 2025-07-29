package wipro_talentnext;
import java.util.Scanner;
public class six {
	public static void main(String[] args) {
		Scanner d=new Scanner(System.in);
		int g =d.nextInt();
		int v =d.nextInt();
		if (g>=0&&v>=0)
		{
		if(g%10==v%10)
		System.out.println("lastdegits ("+g+" "+v+") is True");
		else
		{
			System.out.println("lastdegits ("+g+" "+v+") is False");
		}
}
}
}