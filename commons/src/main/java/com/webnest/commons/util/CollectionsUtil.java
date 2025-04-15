package com.webnest.commons.util;

import java.util.Collection;

public class CollectionsUtil {
	
	/*
	 * Singleton
	 */
	private CollectionsUtil() {
		
	}
	
	public static boolean isEmptyOrNull(Collection<?> collection) {
		return collection == null || collection.isEmpty();
	}

}
