package com.mm.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {
	
	public static String removeFirstChar(String s){
		return s.substring(1);
	}
	
	public static boolean findCurrencySymbol(String text){
		boolean currencyFlag = false;
		String regex = "\\p{Sc}";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(text);
		while (m.find()) {
			currencyFlag = true;
		}
		return currencyFlag;
	}

}
