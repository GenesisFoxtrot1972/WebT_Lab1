package com.company.lw01.businesslogic;


import java.util.ArrayList;

import com.company.lw01.essence.*;
import com.company.lw01.to.TO;
import com.company.lw01.view.*;

/**
 * Created by Valera on 7/3/14.
 */
public class CommandGetMostExpensive extends Command {
	public CommandGetMostExpensive(View view) 
	{
		super(view);
    }
	/**
	 * <p> Method looks for the most precious treasure</p>
	 * @param TO 
	 * @return void because it's active model of MVC
	 */
	@Override
	public void execute(TO trans){
    	Storage stor = Storage.getStorage();
    	ArrayList<Treasure> treasList = stor.getList();
    	Treasure result = treasList.get(0);
    	 for (Treasure treasure : treasList )
    	{
    		if (treasure.getCost() > result.getCost())
    		{
    			result = treasure;
    		}
    	}
    	view.print(result);
    }
}
