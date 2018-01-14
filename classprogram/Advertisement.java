import java.util.Date;
import java.util.*;

public class Advertisement {

    Scanner reader = new Scanner(System.in);

    static int Advertisement_id = 0;
    private String Client_name;
    private Date start_date;

    public void read() {
        System.out.println("Enter the id:");
        this.Advertisement_id = Integer.parseInt(reader.nextLine());

        System.out.println("Enter the Client name");
        this.Client_name = reader.nextLine();
    }

    public void display() {
        System.out.println("the adv. id is " + this.Advertisement_id);
        System.out.println("The Client name is " + this.Client_name);
    }

    public Advertisement() {
        this.Advertisement_id++;
    }    

    public static void main(String[] args) {
        
        Advertisement obj = new Advertisement();
        obj.read();
        obj.display();

        Commercial_Add obj1 = new Commercial_Add(23,400);
        obj1.read();
        obj1.display();

        Free_Add obj2 = new Free_Add();
        obj2.read();
        obj2.display();

    }



   
    

    public class Commercial_Add extends Advertisement {

        private int size_of_add;
        private int price_of_add;

        public Commercial_Add(int size, int price){
            size_of_add = size;
            price_of_add = price;

        }

        public void read() {
            System.out.println("Enter the size: ");
            this.size_of_add = Integer.parseInt(reader.nextLine());

            System.out.println("Enter the price :");
            this.price_of_add = Integer.parseInt(reader.nextLine());
        }

        public void display() {

            System.out.println("The size of adv. is: " + this.size_of_add);
            System.out.println("The price of adv. is " + this.price_of_add);

        }
    }

    public class Free_Add extends Advertisement {
        private int freeadd_time_duration;

        public void read() {
            System.out.println("Enter the duration in months");
            this.freeadd_time_duration = Integer.parseInt(reader.nextLine());
        }

        public void display() {
            System.out.println("The duaration is " + this.freeadd_time_duration + " months");
        }

    }
}