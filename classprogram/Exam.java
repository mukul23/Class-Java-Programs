/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mukul23
 */
import java.util.*;


public class Exam {
    private String str;
    private int num;
    
    public Exam(){
        
    }
    
    public String getStr(){
        return this.str;
    }
    
    public int getNum(){
        return this.num;
    }
    
    public void setStr(String str){
        this.str = str;
    }
    
    public void setNum(int num){
        this.num = num;
    }

    public void read(){
        Scanner reader = new Scanner(System.in);

        System.out.print("\n\nEnter the string: ");
        String userString = reader.nextLine();

        System.out.print("Enter the number: ");
        int userNumber = Integer.parseInt(reader.nextLine());

        this.str = userString;
        this.num = userNumber;
    }

    public void convertCase(){
        String temp = "";

        for(int i=0; i<str.length(); i++){
            
            if(  (int)str.charAt(i)>=97  &&   (int)str.charAt(i)<=122 ){
                // the char is a lowercase
                    temp+= str.substring(i,i+1).toUpperCase();

            }else if( (int)str.charAt(i)>=65 && (int)str.charAt(i)<= 90 ){
                // the character is a uppercase
                temp+= str.substring(i,i+1).toLowerCase();
            }
        }

        System.out.println("\nThe converted string is : "+temp);
    }

    public void powerDigit() {
        // first convert the integer to string to use the charAt function

        String intAsString = Integer.toString(num);

        int buffer = 0;
        // iterate thru the integers
        for(int i=0; i<intAsString.length();i++){
            String s = Character.toString(intAsString.charAt(i));
            int cube = Integer.parseInt(s) * Integer.parseInt(s) * Integer.parseInt(s);
            buffer+= cube;
        }

        
        System.out.println("\nThe cube of the sum of digits is: "+ buffer);
    }

    public void count(){
        int countOfVowels = 0;
        String s = str.toLowerCase(); // first convert all in lowerCase then check so that we reduce the load of checking Capital letters
        for(int i=0; i<s.length();i++){

            char test = s.charAt(i);
            if(test == 'a' || test =='e' || test == 'i' || test == 'o' || test == 'u'){
                    countOfVowels++;
            }
        }

        System.out.println("\nThe number of vowels are: "+ countOfVowels);
    }


}

