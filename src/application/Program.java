package application;

import model.entities.ComboDevice;
import model.entities.ConcretePrinter;
import model.entities.ConcreteScanner;

public class Program {

	public static void main(String[] args) {
		ConcretePrinter p = new ConcretePrinter("1000");
		p.processDoc("My Letter");
		p.print("My Letter");
		System.out.println();
		ConcreteScanner s = new ConcreteScanner("203F");
		s.processDoc("My Email");
		System.out.println("Scan result :" + s.scan() );
		System.out.println();
		ComboDevice c = new ComboDevice("FG120");
		c.processDoc("Super Combo");
		c.print("Super Combo");
		System.out.println("Scan result :" + c.scan() );

	}

}
