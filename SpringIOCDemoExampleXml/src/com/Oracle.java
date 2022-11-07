package com;

public class Oracle implements Example{

	public Oracle() {
		System.out.println("Oracle Constructor");
	}
	@Override
	public void exON() {
		System.out.println("Oracle Example ON");
		
	}

	@Override
	public void exOFF() {
		System.out.println("Oracle Example OFF");
		
	}

}
