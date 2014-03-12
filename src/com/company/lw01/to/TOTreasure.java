package com.company.lw01.to;

public class TOTreasure extends TO {
	public String treasureName;
	public int treasureID, treasureCost;
	
	public TOTreasure(int id, String name, int cost)
	{
		treasureName = name;
		treasureID = id;
		treasureCost = cost ;
	}
}
