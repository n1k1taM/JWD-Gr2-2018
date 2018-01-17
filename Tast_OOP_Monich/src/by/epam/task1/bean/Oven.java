package by.epam.task1.bean;

import java.io.Serializable;

public class Oven implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int powerConsumtion;
	private int weight;
	private int capacity;
	private float depth;
	private float height;
	private float width;


	public Oven() {
		super();
	}

	public Oven(int powerConsumtion, int weight, int capacity, float depth, float height, float width) {
		super();
		this.powerConsumtion = powerConsumtion;
		this.weight = weight;
		this.capacity = capacity;
		this.depth = depth;
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

	public int getCapacity() {
		return capacity;
	}
	
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public float getDepth() {
		return depth;
	}
	
	public void setDepth(float depth) {
		this.depth = depth;
	}
	
	public float getHeight() {
		return height;
	}
	
	public void setHeight(float height) {
		this.height = height;
	}
	
	public float getWidth() {
		return width;
	}
	
	public void setWidth(float width) {
		this.width = width;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	@Override
	public String toString() {
		return "Oven [powerConsumtion=" + powerConsumtion + ", weight=" + weight + ", capacity=" + capacity + ", depth="
				+ depth + ", height=" + height + ", width=" + width + "]";
	}
	
	


	
	
	
	
	
	
}
