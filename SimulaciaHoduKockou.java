import java.util.Random;

public class SimulaciaHoduKockou {

	public static void main(String[] args) {
		Random random = new Random();
		MnozinaDat kocky = new MnozinaDat();
		
		int cislo1 = random.nextInt(6)+1;
		int cislo2 = random.nextInt(6)+1;
		
		System.out.println("Kocka 1 hodila cislo: " + cislo1);
		System.out.println("Kocka 2 hodila cislo: " + cislo2);
		System.out.println("-------------------------------------------------------");

		kocky.pridaj(new Kocka(cislo1));
		kocky.pridaj(new Kocka(cislo2));

		Kocka maxCislo = kocky.getMaximum();
		Kocka minCislo = kocky.getMinimum();

		System.out.println("najvyssia hodnota: " + maxCislo.getHodnota());
		System.out.println("najnizsia hodnota: " + minCislo.getHodnota());
		
	}

}
