package by.tc.task01.entity;



public class VacuumCleaner extends Appliance{
	// you may add your own code here
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

	
	
	
	
	public VacuumCleaner() {
		super();
		
	}




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





	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bagType == null) ? 0 : bagType.hashCode());
		result = prime * result + cleaningWidth;
		result = prime * result + ((filterType == null) ? 0 : filterType.hashCode());
		result = prime * result + motorSpeedRegulation;
		result = prime * result + powerConsumtion;
		result = prime * result + ((wandType == null) ? 0 : wandType.hashCode());
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
		VacuumCleaner other = (VacuumCleaner) obj;
		if (bagType == null) {
			if (other.bagType != null)
				return false;
		} else if (!bagType.equals(other.bagType))
			return false;
		if (cleaningWidth != other.cleaningWidth)
			return false;
		if (filterType == null) {
			if (other.filterType != null)
				return false;
		} else if (!filterType.equals(other.filterType))
			return false;
		if (motorSpeedRegulation != other.motorSpeedRegulation)
			return false;
		if (powerConsumtion != other.powerConsumtion)
			return false;
		if (wandType == null) {
			if (other.wandType != null)
				return false;
		} else if (!wandType.equals(other.wandType))
			return false;
		return true;
	}





	@Override
	public String toString() {
		return "VacuumCleaner [powerConsumtion=" + powerConsumtion + ", filterType=" + filterType + ", bagType="
				+ bagType + ", wandType=" + wandType + ", motorSpeedRegulation=" + motorSpeedRegulation
				+ ", cleaningWidth=" + cleaningWidth + "]";
	}
}
