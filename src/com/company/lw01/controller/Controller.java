package com.company.lw01.controller;

import com.company.lw01.businesslogic.*;
import com.company.lw01.to.TO;
import com.company.lw01.view.View;

/**
 * Created by Valera on 7/3/14 .
 */
public class Controller 
{
	private final View view;
	private final CommandFactory comFac;

	public Controller() 
	{
		view = new View();
		comFac = new CommandFactory(view);
	}

	/**
	 * <p> Method wait for actions from view and performs methods from business logic layer which match the request </p>
	 */
	public void run() 
	{
		TO to;
		do 
		{
			to = view.getOperation();
			Command command = comFac.getCommand(to.operationID);
			command.execute(to);
		} while (to.operationID != 0);
	}

}
