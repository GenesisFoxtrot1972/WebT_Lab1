package com.company.lw01.businesslogic;

import com.company.lw01.transfer.TO;

/**
 * Created by Valera on 7/3/14.
 */
public interface Command {
	public abstract void execute(TO trans);
}
