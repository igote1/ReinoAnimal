package ReinoAnimal;

import java.util.Date;

/**
 * @author Jose Igor

 */

public class Aereo extends Animal{
	private double alt;
	
	public Aereo(String especie, String sexo, String dataNasci, double alt) {
		super(especie, sexo, dataNasci);
		this.alt = alt;
	}
	
	public void voar() {
		System.out.println("o animal está voando há " + alt + " metros...");
	}
	
	
	public void comer(String especie) {
		System.out.println("o animal, "  + especie + ", esta  comendo...");
	}
	
	
	
	public void perfil() {
		System.out.println(getContador());
		System.out.println(getDataNasci());
		System.out.println(getespecie());
		System.out.println(getSexo());
		System.out.println(alt);
	}

}
