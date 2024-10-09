  
//<--------------------------------NUMBER GAME------------------------------------->

import java.util.Scanner;
import java.util.Random;
class codsoft_Task1{
     public static void main(String[] args){
        Scanner sc  = new  Scanner(System.in);
        System.out.println( "**            Well come to my game                 ** \n Hello user you can take only 10 attempt ");
        //Randam class for creaat a randam number
        Random  randam = new Random();
        int count=0;
        int Score=0;
        // loop for declear number of attempt
        while(count<10){
         System.out.println("Guess the number from 0 to 100");
        int Guess_number =sc.nextInt();
       int randam_number = randam.nextInt(100);
       System.out.println("Randam number  is  "+randam_number);
      if(Guess_number==randam_number){
        
        System.out.println("Congratulation your gussed number is match!");
      Score++;
       }else{
        System.out.println("your  gussed number is not match ! \n\nTry Again ");
       }
        count++;
    
        }

        System.out.println("Game is over");
        System.out.println("Score = "+Score);

     }
     
}