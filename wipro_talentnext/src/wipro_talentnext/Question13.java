package wipro_talentnext;
import java.util.Scanner;
public class Question13 {
		public void Switch() {
			Scanner AS =new Scanner(System.in);
			char i = AS.next().charAt(0);
			switch(i)
			{
			case'R':
				System.out.println("Red");
				break;
			case'B':
				System.out.println("Blue");
				break;
			case'G':
				System.out.println("Green");
				break;
			case'O':
				System.out.println("Orange");
				break;
			case'Y':
				System.out.println("Yellow");
				break;
			case'W':
				System.out.println("White");
				break;
				default :
					System.out.println("Invalide Code");
			}
			
		}

		public static void main(String[] args) {
			new Question13().Switch();

		}



	}
