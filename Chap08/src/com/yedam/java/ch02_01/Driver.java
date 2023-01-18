package com.yedam.java.ch02_01;

public class Driver {
     public void drive(Vehicle ve) {
    	 if (ve instanceof Bus) {
    		 Bus bus = (Bus)ve;
        	 bus.checkFare();
		}
    	
    	 ve.run();
     }

	public void drive(Bus bus) {
		// TODO Auto-generated method stub
		bus.run();
	}
}
