package com.johnjohn21121.HibernateTelusko.Demo1;

import javax.persistence.Embeddable;

@Embeddable
public class Quotes {
	
	private String quote;
	private int year;
	
	public String getQuote() {
		return quote;
	}
	public void setQuote(String quote) {
		this.quote = quote;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	@Override
	public String toString() {
		return "Quotes [quote=" + quote + ", year=" + year + "]";
	}

}
