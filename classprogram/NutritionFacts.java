/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mukul23
 */


public class NutritionFacts {
    private int servingSize;
    private int servings;
    private int calories;
    private int fat;
    private int sodium;
    private int carbohydrate;
    
    public static class Builder{
        private int servingSize;
        private int servings;
        
        // optional
        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;
        
        public Builder(int servingSize, int servings){
            this.servingSize = servingSize;
            this.servings = servings;
            
        }
        
        public Builder calories(int calories){
            this.calories = calories;
            return this;
        }
        
        public Builder fat(int fat){
            this.fat = fat;
            return this;
        }
        
        public Builder sodium(int sodium){
            this.sodium = sodium;
            return this;
        }
        
        public Builder carbohydrates(int carbohydrate){
            this.carbohydrate = carbohydrate;
            
            return this;
        }
        
        public NutritionFacts build(){
            return new NutritionFacts(this);
        }
    }
    
    private NutritionFacts(Builder builder){
        this.servingSize = builder.servingSize;
        this.servings = builder.servings;
        this.sodium = builder.sodium;
        this.fat =builder.fat;
        this.carbohydrate = builder.carbohydrate;
        this.calories = builder.calories;
    }



    
    
}

