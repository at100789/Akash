package com;

public class MySql implements Demo{
	
	public MySql() {
		System.out.println("mysql constructor--");
		
	}

	@Override
	public void deOn() {
		System.out.println("MySql Demo On");
		
	}

	@Override
	public void deOff() {
		System.out.println("MySql Demo Off");
		
	}

}
