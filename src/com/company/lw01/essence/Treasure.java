package com.company.lw01.essence;

/**
 * Created by Valera on 7/3/14.
 */
public class Treasure 
{
	private int id;
	private String name;
	private int cost;

	public Treasure(int i, String n, int c)
	{
		id = i;
		name = n;
		cost = c;
	}

	public int getID()
	{
		return id;
	};

	public String getName() 
	{
		return name;
	};

	public int getCost() 
	{
		return cost;
	};
}
