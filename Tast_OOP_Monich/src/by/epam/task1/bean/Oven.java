package by.epam.task1.bean;

public class Oven {
	public int powerConsumtion;
	public int weight;
	public int capacity;
	public int depth;
	
	public Oven(int powerConsumtion, int weight, int capacity, int depth) {
		super();
		this.powerConsumtion = powerConsumtion;
		this.weight = weight;
		this.capacity = capacity;
		this.depth = depth;
	}
	
	

	
	
	public Oven() {
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

	
	public int getCapacity() {
		return capacity;
	}

	
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	
	public int getDepth() {
		return depth;
	}

	
	public void setDepth(int depth) {
		this.depth = depth;
	}
	
	
	
	
}
