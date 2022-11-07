package com;

public class Mysql  implements Example{
	
	public Mysql() {
		System.out.println("Mysql Constructor");
	}
	@Override
	public void exON() {
		System.out.println("Mysql Example ON");
		
	}

	@Override
	public void exOFF() {
		System.out.println("Mysql Example OFF ");
	}

}
