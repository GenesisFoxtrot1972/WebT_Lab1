package com.company.lw01.essence;


import java.util.ArrayList;

/**
 * Created by Valera on 7/3/14.
 */
public class Storage 
{
    private final static Storage instance =  new Storage(); 
    private ArrayList<Treasure> treasureList;
    
    private Storage()
    {
        treasureList = new ArrayList<Treasure>();   	
    }
    
    public static Storage getStorage()
    {
    	 return instance;
    }
    
    public ArrayList<Treasure> getList()
    {
       return this.treasureList;
    }
    
}
