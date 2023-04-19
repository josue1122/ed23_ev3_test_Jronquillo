package org.cuatrovientos.ed;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CadenaTest {
	
	@Test
	public void longitud() {
		Cadena target = new Cadena();
		int expected = 4;
		int actual = target.longitud("hola");
		assertEquals("Fail in Vocales", expected, actual);
		assertEquals("Fail in Vocales",0,0);
	}
	@Test
	public void longitudFail() {
		Cadena target = new Cadena();
		int expected = 3;
		int actual = target.longitud("hola");
		assertEquals("Fail in Vocales", expected, actual);
		assertEquals("Fail in Vocales",0,0);
	}

	
	@Test
	public void vocales() {
		Cadena target = new Cadena();
		int expected = 2;
		int actual = target.vocales("hola");
		assertEquals("Fail in Vocales", expected, actual);
		assertEquals("Fail in Vocales",0,0);
	}
	@Test
	public void vocalesFail() {
		Cadena target = new Cadena();
		int expected = 5;
		int actual = target.vocales("hola");
		assertEquals("Fail in Vocales", expected, actual);
		assertEquals("Fail in Vocales",0,0);
	}
	
	
	@Test
	public void invertir() {
		Cadena target = new Cadena();
		String expected = "aloh";
		String actual = target.invertir("hola");
		assertEquals("Fail in Vocales", expected, actual);
		assertEquals("Fail in Vocales","","");
	}
	@Test
	public void invertirFail() {
		Cadena target = new Cadena();
		String expected = "alohjkkjl";
		String actual = target.invertir("hola");
		assertEquals("Fail in Vocales", expected, actual);
		assertEquals("Fail in Vocales","","");
	}
	
	
	@Test
	public void contarLetra() {
		Cadena target = new Cadena();
		int expected = 2;
		int actual = target.contarLetra("holaa",'a');
		assertEquals("Fail in Vocales", expected, actual);
		assertEquals("Fail in Vocales",0,0);
	}
	@Test
	public void contarLetraFail() {
		Cadena target = new Cadena();
		int expected = 5;
		int actual = target.contarLetra("holaa",'a');
		assertEquals("Fail in Vocales", expected, actual);
		assertEquals("Fail in Vocales",0,0);
	}
	
	
	

}
