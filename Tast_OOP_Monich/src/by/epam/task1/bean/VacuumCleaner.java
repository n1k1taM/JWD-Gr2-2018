package by.epam.task1.bean;

public class VacuumCleaner {
	
	public int powerConsumtion;
	public String filterType;
	public String bagType;
	public String wandType;
	public int motorSpeedRegulation;
	public int cleaningWidth;
	
	public VacuumCleaner(int powerConsumtion, String filterType, String bagType, String wandType,
			int motorSpeedRegulation, int cleaningWidth) {
		super();
		this.powerConsumtion = powerConsumtion;
		this.filterType = filterType;
		this.bagType = bagType;
		this.wandType = wandType;
		this.motorSpeedRegulation = motorSpeedRegulation;
		this.cleaningWidth = cleaningWidth;
	}

	/**
	 * @return the powerConsumtion
	 */
	public int getPowerConsumtion() {
		return powerConsumtion;
	}

	
	public void setPowerConsumtion(int powerConsumtion) {
		this.powerConsumtion = powerConsumtion;
	}

	
	public String getFilterType() {
		return filterType;
	}

	
	public void setFilterType(String filterType) {
		this.filterType = filterType;
	}

	
	public String getBagType() {
		return bagType;
	}

	
	public void setBagType(String bagType) {
		this.bagType = bagType;
	}

	
	public String getWandType() {
		return wandType;
	}

	
	public void setWandType(String wandType) {
		this.wandType = wandType;
	}

	
	public int getMotorSpeedRegulation() {
		return motorSpeedRegulation;
	}

	
	public void setMotorSpeedRegulation(int motorSpeedRegulation) {
		this.motorSpeedRegulation = motorSpeedRegulation;
	}

	
	public int getCleaningWidth() {
		return cleaningWidth;
	}

	
	public void setCleaningWidth(int cleaningWidth) {
		this.cleaningWidth = cleaningWidth;
	}
	
	
	
	
	
}
