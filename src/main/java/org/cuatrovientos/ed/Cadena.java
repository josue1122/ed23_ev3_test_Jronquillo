package org.cuatrovientos.ed;

public class Cadena {
	public int longitud(String cadena) {
		return cadena.length();
	}
	
	public int vocales(String cadena) {
		final String VOCALES = "aeiou";
		int numVocales = 0;
		for(int i = 0;i<cadena.length();i++) {
			if (VOCALES.indexOf(cadena.charAt(i)) != -1){
				numVocales++;
			}
		}
		return numVocales;
	}
	public String invertir(String cadena) {
		String cadenaInvertida = "";
		for (int i = cadena.length()-1;i >=0;i--) {
			cadenaInvertida += cadena.charAt(i);
		}
		return cadenaInvertida;
	}
	public int contarLetra(String cadena, char caracter) {
		int cantChar = 0;
		for(int i=0;i<cadena.length();i++) {
			if (cadena.charAt(i)==caracter) {
				cantChar++;
			}
		}
		return cantChar;
	}

}
