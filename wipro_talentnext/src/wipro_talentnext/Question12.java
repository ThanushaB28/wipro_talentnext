package wipro_talentnext;
import java.util.Scanner;
public class Question12
{
	public static void main(String[] args) {
	Scanner as=new Scanner(System.in);
	char value =as.nextLine().charAt(0);
	if((value>='A')&&(value<='Z'))
	{
		char lowerCase=(char)(value+32);
	System.out.println(lowerCase);
	}
	else if((value>='a')&&value<='z')
	{
		char uperCase =(char)(value-32);
		System.out.println(uperCase);
	}
}
}

