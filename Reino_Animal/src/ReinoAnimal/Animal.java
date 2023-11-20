package ReinoAnimal;

import java.util.Date;

public class Animal {
	private String especie;
	private String sexo;
	private String dataNasci;
	private static int contador;

	/**
	 * @author Jose Igor
	 * @param especie, serve para ddizer qual a especie do animal
	 * @param sexo serve para dizer o sexo do animal.
	 * @param dataNasci serve para dizer a data de nascimento do animal.
	 * @param contador sefve para acumular a quantiade de animais instanciados
	 */

	public Animal(String especie, String sexo, String dataNasci) {
		this.especie = especie;
		this.sexo = sexo;
		this.dataNasci = dataNasci;
		this.setContador(contador + 1);
	}
	/**
	 * o metodo Animal serve para conter os atributos dos animais que vãos ser usados.
	 */
	
	public void comer() {
		System.out.println("o animal, "  + especie + ", esta comendo...");
	}
	
	public void perfil() {
		contador = contador + 1;
		System.out.println(contador);
		System.out.println(especie);
		System.out.println("a data de nascimento é " + dataNasci);
		System.out.println(sexo);
	}

	public String getespecie() {
		return especie;
	}
	
	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getDataNasci() {
		return dataNasci;
	}

	public void setDataNasci(String dataNasci) {
		this.dataNasci = dataNasci;
	}

	public static double getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}

}
