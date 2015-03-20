package com.clovisleoncio.labs.regex;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class DataRetrieverTest {

	DataRetriever dataRetriever = new DataRetriever("\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}");
	
	@Test
	public void deveObterDadoOcorrenciaUnica() {
		String result = dataRetriever.getSingleResult("Obter o primeiro CPF 038.049.274-16, 123.456.789-01 dessa string");
		assertEquals("038.049.274-16", result);
	}
	
	@Test
	public void deveObterOcorrenciaUnicaArray() {
		List<String> result = dataRetriever.getResultList("Obter os CPFs 038.049.274-16 dessa string");
		String[] resultArray = result.toArray(new String[0]);
		assertEquals("038.049.274-16", resultArray[0]);
	}

	@Test
	public void deveObterVariasOcorrenciasArray() {
		List<String> result = dataRetriever.getResultList("Obter os CPFs 038.049.274-16, 123.456.789-01 dessa string");
		String[] resultArray = result.toArray(new String[0]);
		assertEquals("038.049.274-16", resultArray[0]);
		assertEquals("123.456.789-01", resultArray[1]);
	}

}
