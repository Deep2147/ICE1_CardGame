/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CardGame;
import java.util.*;
/**
 *
 * @author Deep
 */
public class CardTrick {
    public static void main(String[] args)
    {
        CardGame[] magicHand = new CardGame[7]; //array of object
        for(int i=0; i<magicHand.length; i++){
        
        CardGame c1 = new CardGame();//object
        c1.setValue(c1.ranValue());// random number from 1 to 13
        c1.setSuit(CardGame.SUITS[c1.ranSuit()]);
        magicHand[i] =c1;
     
        }
         for(int i=0; i<magicHand.length; i++)
         {
      System.out.println(magicHand[i].getSuit() + " "+ magicHand[i].getValue());
         }
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the suite number:");
         int num = sc.nextInt();
         System.out.println("Enter the value of cards: ");
         int value1 = sc.nextInt();
    }
    
    
}
