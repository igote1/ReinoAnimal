package ReinoAnimal;

import java.util.Date;

public class Terrestre extends Animal{
	private String regiao;
	private boolean pelo;
	
	/**
	 * @author Jose Igor
	 * @param especie serve para izer a especie do animal
	 * @param sexo: o sexo do animal
	 * @param dataNasci: data do animal
	 */
	

	public Terrestre(String regiao, boolean pelo, String especie, String sexo, String dataNasci) {
		super(especie, sexo, dataNasci);
		this.regiao = regiao;
		this.pelo = pelo;
	}
	
	public void mover() {
		System.out.println("o animal esta se movendo...");
	}
	
	public void comer() {
		System.out.println("o animal terrestre esta comendo...");
	}
     
	
	public void perfil() {
		System.out.println(getContador());
		System.out.println(getespecie());
		System.out.println(getSexo());
		System.out.println(getDataNasci());
		System.out.println(regiao);
		System.out.println(pelo);

	}

	

}
