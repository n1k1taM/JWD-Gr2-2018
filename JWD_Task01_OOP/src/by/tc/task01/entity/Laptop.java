package by.tc.task01.entity;

import java.io.Serializable;


public class Laptop extends Appliance implements Serializable{
	// you may add your own code here
	private static final long serialVersionUID = 1L;
	private float battetyCapacity;
	private String operatingSystem;
	private int memoryROM;
	private int systemMemory;
	private float frequencyCPU;
	private int displayInches;
	
	public Laptop(float battetyCapacity, String operatingSystem, int memoryROM, int systemMemory, float frequencyCPU,
			int displayInches) {
		super();
		this.battetyCapacity = battetyCapacity;
		this.operatingSystem = operatingSystem;
		this.memoryROM = memoryROM;
		this.systemMemory = systemMemory;
		this.frequencyCPU = frequencyCPU;
		this.displayInches = displayInches;
	}
	
	
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}


	public float getBattetyCapacity() {
		return battetyCapacity;
	}

	
	public void setBattetyCapacity(float battetyCapacity) {
		this.battetyCapacity = battetyCapacity;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	
	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	
	public int getMemoryROM() {
		return memoryROM;
	}

	
	public void setMemoryROM(int memoryROM) {
		this.memoryROM = memoryROM;
	}

	
	public int getSystemMemory() {
		return systemMemory;
	}

	
	public void setSystemMemory(int systemMemory) {
		this.systemMemory = systemMemory;
	}

	
	public float getFrequencyCPU() {
		return frequencyCPU;
	}

	
	public void setFrequencyCPU(float frequencyCPU) {
		this.frequencyCPU = frequencyCPU;
	}

	
	public int getDisplayInches() {
		return displayInches;
	}

	
	public void setDisplayInches(int displayInches) {
		this.displayInches = displayInches;
	}


	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(battetyCapacity);
		result = prime * result + displayInches;
		result = prime * result + Float.floatToIntBits(frequencyCPU);
		result = prime * result + memoryROM;
		result = prime * result + ((operatingSystem == null) ? 0 : operatingSystem.hashCode());
		result = prime * result + systemMemory;
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
		Laptop other = (Laptop) obj;
		if (Float.floatToIntBits(battetyCapacity) != Float.floatToIntBits(other.battetyCapacity))
			return false;
		if (displayInches != other.displayInches)
			return false;
		if (Float.floatToIntBits(frequencyCPU) != Float.floatToIntBits(other.frequencyCPU))
			return false;
		if (memoryROM != other.memoryROM)
			return false;
		if (operatingSystem == null) {
			if (other.operatingSystem != null)
				return false;
		} else if (!operatingSystem.equals(other.operatingSystem))
			return false;
		if (systemMemory != other.systemMemory)
			return false;
		return true;
	}


	
	@Override
	public String toString() {
		return "Laptop [battetyCapacity=" + battetyCapacity + ", operatingSystem=" + operatingSystem + ", memoryROM="
				+ memoryROM + ", systemMemory=" + systemMemory + ", frequencyCPU=" + frequencyCPU + ", displayInches="
				+ displayInches + "]";
	}
	
	
	
	
	
	
	
	
}
