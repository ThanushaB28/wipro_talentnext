package wipro_talentnext;
import java.util.Scanner;
public class eleven {
	void meth()
	{
	Scanner SS=new Scanner(System.in);
	char a=SS.next().charAt(0);
	char b=SS.next().charAt(0);
	if(a<b) {
	System.out.println(a+", "+b);
	}
	else
	System.out.println(b+","+a);
	}
	public static void main(String[] args) {
	new eleven().meth();
}
}