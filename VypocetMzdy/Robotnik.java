
public class Robotnik {
	private String meno;
	private double hodinaSadzba;
	
	public Robotnik(String meno, double hodinovaSadzba) {
		this.meno = meno;
		this.hodinaSadzba= hodinovaSadzba;
	}

	public String getMeno() {
		return meno;
	}

	public double getHodinaSadzba() {
		return hodinaSadzba;
	}
	
	public double vypocitajMzdu(int pocetHodin) {
		return 0;
	}

}
