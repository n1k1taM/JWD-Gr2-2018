package by.tc.task01.entity;

import java.io.Serializable;

public class Speakers extends Appliance implements Serializable{
	private static final long serialVersionUID = 1L;
	public int powerConsumtion;
	public int numberOfSpeakers;
	public float minFrequencyRangeValue;
	public float maxFrequencyRangeValue;
	public int cordLength;
	
	public Speakers(int powerConsumtion, int numberOfSpeakers, float minFrequencyRangeValue,
			float maxFrequencyRangeValue, int cordLength) {
		super();
		this.powerConsumtion = powerConsumtion;
		this.numberOfSpeakers = numberOfSpeakers;
		this.minFrequencyRangeValue = minFrequencyRangeValue;
		this.maxFrequencyRangeValue = maxFrequencyRangeValue;
		this.cordLength = cordLength;
	}
	
	
	





	public Speakers() {
		super();
		
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public int getPowerConsumtion() {
		return powerConsumtion;
	}
	
	
	public void setPowerConsumtion(int powerConsumtion) {
		this.powerConsumtion = powerConsumtion;
	}

	
	public int getNumberOfSpeakers() {
		return numberOfSpeakers;
	}

	
	public void setNumberOfSpeakers(int numberOfSpeakers) {
		this.numberOfSpeakers = numberOfSpeakers;
	}

	
	public float getMinFrequencyRangeValue() {
		return minFrequencyRangeValue;
	}

	
	public void setMinFrequencyRangeValue(float minFrequencyRangeValue) {
		this.minFrequencyRangeValue = minFrequencyRangeValue;
	}

	
	public float getMaxFrequencyRangeValue() {
		return maxFrequencyRangeValue;
	}

	
	public void setMaxFrequencyRangeValue(float maxFrequencyRangeValue) {
		this.maxFrequencyRangeValue = maxFrequencyRangeValue;
	}

	
	public int getCordLength() {
		return cordLength;
	}

	
	public void setCordLength(int cordLength) {
		this.cordLength = cordLength;
	}








	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cordLength;
		result = prime * result + Float.floatToIntBits(maxFrequencyRangeValue);
		result = prime * result + Float.floatToIntBits(minFrequencyRangeValue);
		result = prime * result + numberOfSpeakers;
		result = prime * result + powerConsumtion;
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
		Speakers other = (Speakers) obj;
		if (cordLength != other.cordLength)
			return false;
		if (Float.floatToIntBits(maxFrequencyRangeValue) != Float.floatToIntBits(other.maxFrequencyRangeValue))
			return false;
		if (Float.floatToIntBits(minFrequencyRangeValue) != Float.floatToIntBits(other.minFrequencyRangeValue))
			return false;
		if (numberOfSpeakers != other.numberOfSpeakers)
			return false;
		if (powerConsumtion != other.powerConsumtion)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Speaker [powerConsumtion=" + powerConsumtion + ", numberOfSpeakers=" + numberOfSpeakers
				+ ", minFrequencyRangeValue=" + minFrequencyRangeValue + ", maxFrequencyRangeValue="
				+ maxFrequencyRangeValue + ", cordLength=" + cordLength + "]";
	}
}
