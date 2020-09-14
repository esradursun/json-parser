package net.sympower.cityzen.apx;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

public class Quote implements Serializable{

	private static final long serialVersionUID = -4716707267328686330L;

	@JsonDeserialize(using = LocalDateDeserializer.class)
	@JsonProperty("date_applied")
	private String dateApplied;
	
	@JsonDeserialize(using = QuoteValueDeserializer.class)
	@JsonProperty("values")
	private QuoteValue values;
	
	public Quote() {}

	public Quote(String date, QuoteValue values) {
		this.dateApplied = date;
		this.values = values;
	}
	
	public String getDate() {
		return dateApplied;
	}
	public void setDate(String date) {
		this.dateApplied = date;
	}
	public QuoteValue getValues() {
		return values;
	}
	public void setValues(QuoteValue values) {
		this.values = values;
	}
	
}
