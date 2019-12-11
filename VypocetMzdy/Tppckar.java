
public class Tppckar extends Robotnik{

	public Tppckar(String meno, double hodinovaSadzba) {
		super(meno, hodinovaSadzba);
		
	}
	
	@Override
	public double vypocitajMzdu(int pocetHodin) {
		double mzda = getHodinaSadzba() * 40;
		return mzda;
	}

}
