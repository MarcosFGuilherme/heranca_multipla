package model.entities;

import model.interfaces.Printer;
import model.interfaces.Scanner;

public class ComboDevice extends Device implements  Scanner, Printer {

	public ComboDevice(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public void print(String doc) {
		System.out.println("ComboPrint : " + doc);
	}

	@Override
	public String scan() {
		return "ComboScan result";
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("Combo Processing: " + doc);
		
	}

}
