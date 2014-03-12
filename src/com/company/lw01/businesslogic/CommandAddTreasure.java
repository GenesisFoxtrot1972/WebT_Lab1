package com.company.lw01.businesslogic;

import java.util.ArrayList;

import com.company.lw01.essence.*;
import com.company.lw01.transfer.*;
import com.company.lw01.view.View;

public class CommandAddTreasure implements Command 
{
	private View view;
	public CommandAddTreasure(View view)  
	{
    	this.view = view;
    }

	/**
	 * <p> Method adds treasure in the storage</p>
	 * @param TO 
	 * @return void because it's active model of MVC
	 */
	@Override
	public void execute(TO trans){
    	Storage stor = Storage.getStorage();
    	ArrayList<Treasure> treasList = stor.getList();
    	TOTreasure treasureParams = (TOTreasure)trans; 
    	Treasure treasure = new Treasure(treasureParams.treasureID,treasureParams.treasureName,treasureParams.treasureCost);
    	treasList.add(treasure);
    	view.print("created");
    }
}
