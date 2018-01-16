package by.epam.task1.bean;

public class Speaker {
	
	public int powerConsumtion;
	public int numberOfSpeakers;
	public float minFrequencyRangeValue;
	public float maxFrequencyRangeValue;
	public int cordLength;
	
	public Speaker(int powerConsumtion, int numberOfSpeakers, float minFrequencyRangeValue,
			float maxFrequencyRangeValue, int cordLength) {
		super();
		this.powerConsumtion = powerConsumtion;
		this.numberOfSpeakers = numberOfSpeakers;
		this.minFrequencyRangeValue = minFrequencyRangeValue;
		this.maxFrequencyRangeValue = maxFrequencyRangeValue;
		this.cordLength = cordLength;
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
	
	
	
	
}
