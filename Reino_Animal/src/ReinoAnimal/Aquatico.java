package ReinoAnimal;

import java.util.Date;

public class Aquatico extends Animal {
	
	private String tipodeAgua;
	private  boolean escamas;
	/**
	 * @author Jose Igor
	 * * @param TipoAgua serve para dizer qual o tipo de agua que o peixe vive, se ela e salobra, salgada, doce...
	 * @param escamas booleano para dizer se o animal tem escamas ou nao
	 */
	
	public Aquatico(String tipodeAgua, boolean escamas , String especie, String sexo, String dataNasci) {
		super(especie, sexo, dataNasci);
		this.tipodeAgua = tipodeAgua;
		this.escamas = escamas;
	}

	public void nadar() {
		System.out.println("o animal esta nadando...");
	}
	
	
	
	public void perfil() {
		System.out.println(getContador());
		System.out.println(getespecie());
		System.out.println(escamas);
		System.out.println(tipodeAgua);
		System.out.println(getDataNasci());
		System.out.println(getSexo());
		

	}

	

}
