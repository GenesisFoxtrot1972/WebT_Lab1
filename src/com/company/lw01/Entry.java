package com.company.lw01;


import com.company.lw01.controller.*; 
import com.company.lw01.view.*; 

/**
 * Created by Valera on 7/3/14.
 */
public class Entry {
	/**
	 * <p> Just entry <p>
	 * it runs the controller
	 * @param args	  
	 */
	public static void main(String[] args) 
	{
		View view = new View();
		Controller controll = new Controller();
		controll.setView(view);
		controll.run();
	}

}
