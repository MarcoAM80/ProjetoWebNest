package com.webnest.commons.util;

public class StringUtil {

	/*
	 * Singleton
	 */
	private StringUtil() {
	}

	public static boolean isEmptyOrNull(String str) {
		return str == null || str.isEmpty();
	}

	public static String subString(String valor, int inicio) {
		return subString(valor, inicio, valor != null ? valor.length() : 0);
	}

	public static String subString(String valor, int inicio, int tamanho) {

		if ( inicio < 1 ) {
			throw new StringIndexOutOfBoundsException(inicio);
		}

		if ( valor == null || valor.length() == 0 || inicio > valor.length()) {
			return "";
		}

		inicio--;

		int fim = inicio + tamanho;

		if ( fim > valor.length()  ) {
			fim = valor.length();
		}
		return valor.substring(inicio, fim);
	}

	public static char getFirstChar(String str) {
		return isEmptyOrNull(str) ? ' ' : str.charAt(0);
	}
	public static char getLastChar(String str) {
		return isEmptyOrNull(str) ? ' ' : str.charAt(str.length()-1) ;
	}

	public static String append(Object...concatenacoes) {
		StringBuilder sb = new StringBuilder(concatenacoes.length * 10);
		for ( Object concatenacao : concatenacoes ) {
			sb.append(concatenacao);
		}
		return sb.toString();
	}

}
