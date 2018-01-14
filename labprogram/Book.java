package ThingsBox;

public class Book implements ToBeStored {
    private String writer;
    private String name;
    private double weight;

    public Book(String writer, String name, double weight) {
        this.writer = writer;
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

//    public double getWeight() {
//        return weight;
//    }

    public String getWriter() {
        return writer;
    }
    
   public String toString(){
       return this.writer+": "+ this.name;
   } 
   
   public double weight(){
       return this.weight;
   }
}