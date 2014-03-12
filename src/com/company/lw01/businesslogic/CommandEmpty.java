package com.company.lw01.businesslogic;

import com.company.lw01.to.TO;
import com.company.lw01.view.View;


/**
 * Created by Valera on 7/3/14.
 */
public class CommandEmpty extends Command {
	public CommandEmpty(View view) {
		super(view);
	}

	@Override
	public void execute(TO trans)
	{
		
	}
}
