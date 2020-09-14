package net.sympower.cityzen.apx;

import java.io.Serializable;

public class QuoteValue implements Serializable{

	private static final long serialVersionUID = -5941392510568121624L;
	private String hour;
	private NetVolume netVolume;
	private Price price;
	
	public QuoteValue(){}
	
	public QuoteValue(String hour, NetVolume netVolume, Price price) {
		this.hour = hour;
		this.netVolume = netVolume;
		this.price = price;
	}
	
	public String getHour() {
		return hour;
	}
	public void setHour(String hour) {
		this.hour = hour;
	}
	public NetVolume getNetVolume() {
		return netVolume;
	}
	public void setNetVolume(NetVolume netVolume) {
		this.netVolume = netVolume;
	}
	public Price getPrice() {
		return price;
	}
	public void setPrice(Price price) {
		this.price = price;
	}
}
