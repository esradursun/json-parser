package net.sympower.cityzen.apx;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class QuoteResponse implements Serializable{
	
	private static final long serialVersionUID = -2503911552214758375L;
	
	private List<Quote> quote = new ArrayList<Quote>();

	public QuoteResponse() {}

	public QuoteResponse(List<Quote> quote) {
		this.quote = quote;
	}

	public List<Quote> getQuote() {
		return quote;
	}

	public void setQuote(List<Quote> quote) {
		this.quote = quote;
	}
	
	
}
