import java.util.ArrayList;

public class MnozinaDat 
{

	private ArrayList<Kocka> cisla;
	

	public MnozinaDat() 
	{
		cisla = new ArrayList<Kocka>();
	}
	/**
	 * pridava objekt typu Kocka
	 * @param typKocka
	 */
	public void pridaj(Kocka typKocka) 
	{
		cisla.add(typKocka);	

	}
	/**
	 * vracia minimalnu hodnotu z 2 hodov kocky
	 * @return minimalna hodnota
	 */
	public Kocka getMinimum() 
	{
		int minimum = Math.min(cisla.get(0).getHodnota(), cisla.get(1).getHodnota());
		Kocka min = new Kocka (minimum);
		return min;
	}
	/**
	 * 	vracia maximalnu hodnotu z 2 hodov kocky
	 * @return maximalna hodnota
	 */
	public Kocka getMaximum() 
	{
		int maximum = Math.max(cisla.get(0).getHodnota(), cisla.get(1).getHodnota());
		Kocka max = new Kocka (maximum);
		return max;
		
		
	}
	
}
