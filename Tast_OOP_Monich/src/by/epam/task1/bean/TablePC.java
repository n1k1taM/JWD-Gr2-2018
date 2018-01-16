package by.epam.task1.bean;

public class TablePC {
	public float battetyCapacity;
	public int displayInches;
	public int memoryROM;
	public int flashMemoryCapacity;
	public String color;
	
	public TablePC(float battetyCapacity, int displayInches, int memoryROM, int flashMemoryCapacity, String color) {
		super();
		this.battetyCapacity = battetyCapacity;
		this.displayInches = displayInches;
		this.memoryROM = memoryROM;
		this.flashMemoryCapacity = flashMemoryCapacity;
		this.color = color;
	}

	
	public float getBattetyCapacity() {
		return battetyCapacity;
	}

	
	public void setBattetyCapacity(float battetyCapacity) {
		this.battetyCapacity = battetyCapacity;
	}

	
	public int getDisplayInches() {
		return displayInches;
	}

	
	public void setDisplayInches(int displayInches) {
		this.displayInches = displayInches;
	}

	
	public int getMemoryROM() {
		return memoryROM;
	}

	
	public void setMemoryROM(int memoryROM) {
		this.memoryROM = memoryROM;
	}

	public int getFlashMemoryCapacity() {
		return flashMemoryCapacity;
	}

	
	public void setFlashMemoryCapacity(int flashMemoryCapacity) {
		this.flashMemoryCapacity = flashMemoryCapacity;
	}

	
	public String getColor() {
		return color;
	}

	
	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	
	
}
