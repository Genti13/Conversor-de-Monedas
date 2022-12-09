package ar.genti.conversorMoneda;

public class Euro extends Moneda {


	@Override
	public Double toUSA() {
		return 1.05;
	}

	@Override
	public Double toLocal() {
		return 0.95;
	}

}
