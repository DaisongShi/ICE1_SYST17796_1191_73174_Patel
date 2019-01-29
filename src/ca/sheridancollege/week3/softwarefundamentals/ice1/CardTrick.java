/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 * student number: 991532802
 * 
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Megha Patel
 */

import java.util.Scanner;

public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)(Math.random() * 13) + 1);
  
            c.setSuit(Card.SUITS[(int) (Math.random()*4) ]);
        }
        
        
        Card luckyCard = new Card();
        
        luckyCard.setValue(9);
        luckyCard.setSuit("Hearts");
        
        String luckyCardString = "lucky card " + luckyCard.getValue() + " of "
            + luckyCard.getSuit();
            
        String msg = " is not in magic hand";
        
        for (int i=0; i< magicHand.length; i++) {
            if(luckyCard == magicHand[i]) {
                
                msg = " is in magic hand";
                break;
            }
        };
        
        System.out.println(luckyCardString + msg);
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        
        
    }
    
}
