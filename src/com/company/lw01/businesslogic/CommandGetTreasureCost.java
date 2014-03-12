package com.company.lw01.businesslogic;


import com.company.lw01.essence.*;
import com.company.lw01.to.TOCost;
import com.company.lw01.to.TO;
import com.company.lw01.view.View;
import java.util.ArrayList;
/**
 * Created by Valera on 7/3/14.
 */
public class CommandGetTreasureCost extends Command
{
	public CommandGetTreasureCost(View view) 
	{
		super(view);
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
