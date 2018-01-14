import java.util.*;

public class UserInterface{
	private Scanner reader;

	public UserInterface(){
		this.reader = new Scanner(System.in);


	}

	public void start(){
		Exam exam = new Exam();
		exam.read();

		while(true){
		

		System.out.println("\n\nEnter your choice: ");
		System.out.println("1. Convert the case ");
		System.out.println("2. Cube of the sum of digits");
		System.out.println("3. Number of vowels");
		System.out.println("4. Exit\n");

		int choice  = Integer.parseInt(reader.nextLine());
			

			if(choice == 1){
				exam.convertCase();
			}

		else if(choice == 2){
				exam.powerDigit();
			}

		else if(choice == 3){
				exam.count();
			}

		else if(choice == 4){
				break;
			}

		}
	}


}