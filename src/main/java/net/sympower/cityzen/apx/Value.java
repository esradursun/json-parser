package net.sympower.cityzen.apx;

import java.io.Serializable;

public abstract class Value implements Serializable {
	
	private static final long serialVersionUID = -4057575849159027787L;
	
	private Double value;
	private String unit; 
	
	
	public Value() {
		super();
	}

	public Value(Double value, String unit) {
		super();
		this.value = value;
		this.unit = unit;
	}
	
	public Double getValue() {
		return value;
	}
	public void setValue(Double value) {
		this.value = value;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}

}
