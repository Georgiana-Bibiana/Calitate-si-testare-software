package ro.ase.cts.state.program;

import ro.ase.cts.state.clase.Masa;
import ro.ase.cts.state.clase.StareLibera;

public class Program {
	public static void main(String[] args) {
		Masa masa1=new Masa(10);
		masa1.elibereazaMasa();
		masa1.rezervaMasa();
		//masa1.setStare(new StareLibera());
		masa1.rezervaMasa();
		masa1.ocupaMasa();
	}

}
