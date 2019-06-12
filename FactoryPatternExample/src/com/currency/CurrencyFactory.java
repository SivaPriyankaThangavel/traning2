package com.currency;

public class CurrencyFactory {
	public static Currency createCurrency (String country) {
	       if (country. equalsIgnoreCase ("India")){
	              return new Rupee();
	       }else if(country. equalsIgnoreCase ("China")){
	              return new ChineseYuan();
	       }else if(country. equalsIgnoreCase ("USA")){
	              return new USDollar();
	        }
	       throw new IllegalArgumentException("No such currency");
	       }

}
