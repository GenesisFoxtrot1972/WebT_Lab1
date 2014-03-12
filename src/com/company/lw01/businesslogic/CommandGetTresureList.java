package com.company.lw01.businesslogic;

import com.company.lw01.essence.*;
import com.company.lw01.to.TO;
import com.company.lw01.view.*;


/**
 * Created by Valera on 7/3/14.
 */
public  class CommandGetTresureList extends Command {
	public CommandGetTresureList(View view) 
	{
		super(view);	
	}

	/**
	 * @param TO 
	 * @return void because it's active model of MVC
	 */
	@Override
	public void execute(TO trans){
    	Storage stor = Storage.getStorage();
    	view.print(stor.getList());
    }
}
