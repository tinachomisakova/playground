
public class Brigadnik extends Robotnik{

	public Brigadnik(String meno, double hodinovaSadzba) {
		super(meno, hodinovaSadzba);
	}
	
	@Override
	public double vypocitajMzdu(int pocetHodin) {
		if (pocetHodin > 20) {
			double pocetExtraHodin = pocetHodin -20;
			double priplatok = pocetExtraHodin * (getHodinaSadzba()/2);
			double mzda = (pocetHodin- pocetExtraHodin) * getHodinaSadzba() + priplatok;
			return mzda;
			
		}
		return pocetHodin*getHodinaSadzba();
	}

}
