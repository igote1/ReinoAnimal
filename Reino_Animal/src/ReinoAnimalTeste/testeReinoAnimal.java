package ReinoAnimalTeste;

import java.util.Date;

import ReinoAnimal.*;

public class testeReinoAnimal {
	/**
	 * @author Jose Igor
	 */
	public static void main(String[] args) {


		Aquatico aqua = new Aquatico("Carcharias taurus", false, "fêmea", "7", "água salgada");
		aqua.comer();
		aqua.perfil();
		aqua.nadar();

		Aquatico AQUA = new Aquatico("Pygocentrus nattereri", true, "macho", "3", "água doce");

		System.out.println("------------------");

		Terrestre terrestre = new Terrestre("Felis catus", true, "fêmea", "2", "Asia");
		terrestre.perfil();
		terrestre.mover();
		terrestre.comer();

		System.out.println("-------------------");

		Terrestre T = new Terrestre("Hydrochoerus hydrochaeris", true, "macho", "8", "América do Sul");
		
		T.perfil();
		T.mover();
		T.comer();

		System.out.println("-------------------");

		Aereo aereo = new Aereo("Coragyps atratus", "macho", "3", 54.5);
		aereo.comer();
		aereo.perfil();
		aereo.voar();
		
		System.out.println("--------------------");
		
		Aereo A = new Aereo("Amazona aestiva", "fêmea", "10", 37.9);
		A.comer();
		A.perfil();
		A.voar();

	}
}
