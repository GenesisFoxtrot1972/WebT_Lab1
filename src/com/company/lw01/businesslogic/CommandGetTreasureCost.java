package com.company.lw01.businesslogic;


import com.company.lw01.essence.*;
import com.company.lw01.transfer.TO;
import com.company.lw01.transfer.TOCost;
import com.company.lw01.view.View;
import java.util.ArrayList;
/**
 * Created by Valera on 7/3/14.
 */
public class CommandGetTreasureCost implements  Command
{
	private View view;
	public CommandGetTreasureCost(View view) 
	{
		this.view = view;
	}

	/**
	 * <p> Method gaining treasure to the amount of cost</p>
	 * @param TO 
	 * @return void because it's active model of MVC
	 */
	@Override
	public void execute(TO trans)
	{
		int curcost, cost, i=0;
    	Storage stor = Storage.getStorage();
    	TOCost tocost = (TOCost)trans;
    	ArrayList<Treasure> tresList = stor.getList();
    	curcost = tresList.get(0).getCost();
    	cost = tocost.cost;
        ArrayList<Treasure> t = new ArrayList<Treasure>();
     	while (curcost <cost)
     	{ 
     	   curcost+=tresList.get(i+1).getCost();
    	   t.add(tresList.get(i));
    	   i++;
    	}
    	view.print(t);
    }
}
