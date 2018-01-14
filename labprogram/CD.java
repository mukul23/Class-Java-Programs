package ThingsBox;

public class CD implements ToBeStored {
    private String artist;
    private String title;
    private int publishingYear;
    private final double weight;

    public CD(String artist, String title, int publishingYear) {
        this.artist = artist;
        this.title = title;
        this.publishingYear = publishingYear;
        this.weight = 0.1;
    }

    public String getArtist() {
        return artist;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public String getTitle() {
        return title;
    }

//    public double getWeight() {
//        return weight;
//    }

    @Override
    public String toString() {
        return this.artist+": "+this.title+" {"+this.publishingYear+")"; //To change body of generated methods, choose Tools | Templates.
    }
    
    public double weight(){
        return this.weight;
    }
    
    

   
    
    
}
