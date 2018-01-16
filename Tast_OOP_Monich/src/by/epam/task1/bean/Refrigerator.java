package by.epam.task1.bean;

public class Refrigerator {
	public int powerConsumtion;
	public int weight;
	public int freezerCapacity;
	public int overallCapacity;
	public int height;
	public int width;
	
	public Refrigerator(int powerConsumtion, int weight, int freezerCapacity, int overallCapacity, int height,
			int width) {
		super();
		this.powerConsumtion = powerConsumtion;
		this.weight = weight;
		this.freezerCapacity = freezerCapacity;
		this.overallCapacity = overallCapacity;
		this.height = height;
		this.width = width;
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

	/**
	 * @return the freezerCapacity
	 */
	public int getFreezerCapacity() {
		return freezerCapacity;
	}

	
	public void setFreezerCapacity(int freezerCapacity) {
		this.freezerCapacity = freezerCapacity;
	}

	
	public int getOverallCapacity() {
		return overallCapacity;
	}

	
	public void setOverallCapacity(int overallCapacity) {
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
	
		
	
}
