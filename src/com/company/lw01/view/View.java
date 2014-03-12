package com.company.lw01.view;

import java.util.Random;
import com.company.lw01.essence.*;

import java.util.ArrayList;

import com.company.lw01.transfer.*;
/**
 * Created by Valera on 7/3/14.
 */
public class View {
	
   private int i;
   
   public View()
   {
	  i=0;
   }
   
   /**
    * <p> Method simulates user</p>
    * @return TO 
    */
   public TO  getOperation() 
   {
	   TO result;
	   Random rand ;
	   if (i<10)                          //It's magic values to simulate user input     
	   {
		   rand = new Random();
           result = this.treasureInput( i ,  "tresuare#" + i , rand.nextInt(1000));    
	   }  
	   else 
	   {
		   if (i == 10)                                
		   {
			   result = new TOCost(this.getCost());
		   }
		   else
		   {   
 		       result = new TO();
		   }
		   result.operationID = 13-i;
	       System.out.println("User choose operation " + (13 - i));
	   }
	   i++;
	   return result;
   }
   
   public int  getCost()
   {
	   Random rand = new Random();
	   int result = rand.nextInt(2000);
	   System.out.println("User choose Cost " + result);
	   return result;
   }

   public TO treasureInput(int id, String name, int cost)
   {
       TO result = new TOTreasure(id, name, cost);
       System.out.println(id + " " + name + " cost: " + cost);
       result.operationID = 4;
       return result;
   }
   
   public void print(Treasure[] treasureList)
   {
	   int i;
	   for (i = 0; i<treasureList.length; i++)
		   System.out.println("   " +treasureList[i].getID() + " "  + treasureList[i].getName() + "  Cost:"  + treasureList[i].getCost() );
   }
   
   public void print(Treasure treasure)
   {
	   System.out.println("   " +treasure.getID() + " "  + treasure.getName() + "  Cost:"  + treasure.getCost() );
   }
   
   public void print(String str)
   {
	   System.out.println(str);
   }
   
   public void print(ArrayList<Treasure> treas)
   {
	   for (Treasure treasure : treas )
	       System.out.println("   " +treasure.getID() + " "  + treasure.getName() + "  Cost:"  + treasure.getCost() );
   }  
   
   public void showMenu(){
       System.out.println("Menu:");
       System.out.println(" 1: Get Treasure List");
       System.out.println(" 2: Get Most Expensive Treasure");
       System.out.println(" 3: Get Treasure by Cost");
       System.out.println(" 4: Insert Treasure");
       System.out.println(" 0: Exit");
   }
}

   