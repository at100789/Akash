package com;

public class Oracle implements Demo {

	public Oracle() {

		System.out.println("Oracle Constructor");

	}

	@Override
	public void deOn() {
		System.out.println("Oracle Demo On");
	}

	@Override
	public void deOff() {
		System.out.println("Oracle" + " Demo On");
	}

}
