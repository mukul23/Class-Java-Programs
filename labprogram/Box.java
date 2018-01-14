package ThingsBox;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mukul23
 */
import java.util.ArrayList;

public class Box implements ToBeStored   {
    private double maxWeight;
    private ArrayList<ToBeStored> items;
    
    public Box(int maxWeight){
        this.maxWeight = maxWeight;
        items = new ArrayList<ToBeStored>();
        
    }
    
    public void add(ToBeStored obj){
        if(this.weight() + obj.weight() > this.maxWeight){
            return;
        }
        
        items.add(obj);
        
        
    }
    
    public double weight(){
        if(items.size() == 0) {
            return 0;
        }
        
        double weight = 0;
        for(ToBeStored t : items){
            weight+= t.weight();
        }
        return weight;
    }

    @Override
    public String toString() {
        return "Box: "+this.size()+" things, total weight "+this.weight()+" kg";
    }
    
    private int size(){
        return items.size();
    }
    
    
    
}
