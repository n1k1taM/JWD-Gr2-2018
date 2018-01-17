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
	
	

	
	
	public TablePC() {
		super();
		
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





	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(battetyCapacity);
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + displayInches;
		result = prime * result + flashMemoryCapacity;
		result = prime * result + memoryROM;
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
		TablePC other = (TablePC) obj;
		if (Float.floatToIntBits(battetyCapacity) != Float.floatToIntBits(other.battetyCapacity))
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (displayInches != other.displayInches)
			return false;
		if (flashMemoryCapacity != other.flashMemoryCapacity)
			return false;
		if (memoryROM != other.memoryROM)
			return false;
		return true;
	}





	@Override
	public String toString() {
		return "TablePC [battetyCapacity=" + battetyCapacity + ", displayInches=" + displayInches + ", memoryROM="
				+ memoryROM + ", flashMemoryCapacity=" + flashMemoryCapacity + ", color=" + color + "]";
	}
	
	
	
	
	
	
}
