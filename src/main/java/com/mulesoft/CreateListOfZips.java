/*
 * My Little Zip Generator
 * @Author Jameson Triplett
 */
package com.mulesoft;



import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class CreateListOfZips {

    private final int NO_OF_BIDS = 100;

    protected String getConfigResources() {
        return "beanstalk-rds-demo.xml";
    }

    public Collection<String> testAuctionService(String obj) throws Exception {
    	int myInput = 0;
    	try{
    		String strInput = obj.trim();
    		Integer myInteger = Integer.valueOf(strInput);
    		 myInput = myInteger.intValue();
    	}
    	catch(Exception e)
    	{ 
    		System.err.println("Got + " + obj.toString() + "Error: " + e.getMessage() +"\n");
    		e.printStackTrace();
    		myInput = 2;
    		
    	}
    	
        Collection<String> myList = new ArrayList<String>();
        
        for (int i=0;i<myInput;i++){
        	myList.add(Integer.toString(randInt(10000,99999)));
        }
        
        return myList;
    }
    public static int randInt(int min, int max) {

        // NOTE: Usually this should be a field rather than a method
        // variable so that it is not re-seeded every call.
        Random rand = new Random();

        // nextInt is normally exclusive of the top value,
        // so add 1 to make it inclusive
        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;
    }
}
