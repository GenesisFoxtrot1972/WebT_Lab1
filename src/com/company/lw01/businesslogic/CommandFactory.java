package com.company.lw01.businesslogic;

import com.company.lw01.view.*;;
/**
 * Created by Valera on 7/3/14.
 */
public class CommandFactory {
   private final CommandGetTresureList commandGetTresureList;
   private final CommandGetMostExpensive commandGetMostExpensive;
   private final CommandGetTreasureCost commandGetTreasureCost;
   private final CommandAddTreasure commandAddTreasure;
   private final CommandEmpty commandEmpty;
   public CommandFactory(View view)
   {
	   commandGetTresureList    = new CommandGetTresureList(view);
	   commandGetMostExpensive = new CommandGetMostExpensive(view);
	   commandGetTreasureCost = new CommandGetTreasureCost(view);
	   commandAddTreasure = new CommandAddTreasure(view);
	   commandEmpty = new CommandEmpty();
   }
   /**
	 * <p> Factory method</p>
	 * @param int number of requested object 
	 * @return Command requested object
	 */
   public Command getCommand(int OperationID)
   {
	   Command result = commandEmpty;
	   switch(OperationID)
	   {
	      case 1:
	         result = commandGetTresureList;
	         break;
	      case 2:
	    	 result = commandGetMostExpensive;
	    	 break;  
	      case 3:
		     result = commandGetTreasureCost;
		     break;  	 
	      case 4:
	    	 result = commandAddTreasure;
	    	 break;
	   }	   
	   return result;
   }
}
