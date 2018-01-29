package by.tc.task01.entity;

import java.io.Serializable;

public class Refrigerator extends Appliance implements Serializable{
	// you may add your own code here
	
	private static final long serialVersionUID = 1L;
	private int powerConsumtion;
	private int weight;
	private int freezerCapacity;
	private float overallCapacity;
	private int height;
	private int width;
	
	
	public Refrigerator(int powerConsumtion, int weight, int freezerCapacity, float overallCapacity, int height,
			int width) {
		super();
		this.powerConsumtion = powerConsumtion;
		this.weight = weight;
		this.freezerCapacity = freezerCapacity;
		this.overallCapacity = overallCapacity;
		this.height = height;
		this.width = width;
	}

	public Refrigerator() {
		super();
		
	}


	

	
	public int getPowerConsumtion() {
		return powerConsumtion;
	}

	public void setPowerConsumtion(int powerConsumtion) {
		this.powerConsumtion = powerConsumtion;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getFreezerCapacity() {
		return freezerCapacity;
	}

	public void setFreezerCapacity(int freezerCapacity) {
		this.freezerCapacity = freezerCapacity;
	}

	public float getOverallCapacity() {
		return overallCapacity;
	}

	public void setOverallCapacity(float overallCapacity) {
		this.overallCapacity = overallCapacity;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + freezerCapacity;
		result = prime * result + height;
		result = prime * result + Float.floatToIntBits(overallCapacity);
		result = prime * result + powerConsumtion;
		result = prime * result + weight;
		result = prime * result + width;
		return result;
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Refrigerator other = (Refrigerator) obj;
		if (freezerCapacity != other.freezerCapacity)
			return false;
		if (height != other.height)
			return false;
		if (Float.floatToIntBits(overallCapacity) != Float.floatToIntBits(other.overallCapacity))
			return false;
		if (powerConsumtion != other.powerConsumtion)
			return false;
		if (weight != other.weight)
			return false;
		if (width != other.width)
			return false;
		return true;
	}

	
	@Override
	public String toString() {
		return "Refrigerator [powerConsumtion=" + powerConsumtion + ", weight=" + weight + ", freezerCapacity="
				+ freezerCapacity + ", overallCapacity=" + overallCapacity + ", height=" + height + ", width=" + width
				+ "]";
	}
}
