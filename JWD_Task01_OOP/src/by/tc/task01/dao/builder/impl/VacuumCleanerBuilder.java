package by.tc.task01.dao.builder.impl;


import by.tc.task01.dao.builder.ApplianceBuilder;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.VacuumCleaner;

public class VacuumCleanerBuilder implements ApplianceBuilder {

	@Override
	public Appliance build(String ApplinceType, String line) {
		VacuumCleaner vacuumCleaner = new VacuumCleaner();
//		String[] attribute = line.replace(",", " ").split("  ");
		String[] appliance = line.replace(";", "").split(" : ");
		String applianceParameterLine = appliance[1];
		String[] attribute = applianceParameterLine.replace(",", " ").split("  ");
		
		String[] temp = attribute[0].split("=");
		vacuumCleaner.setPowerConsumtion(Integer.parseInt(temp[1]));
		temp = attribute[1].split("=");
		vacuumCleaner.setFilterType(temp[1]);
		temp = attribute[2].split("=");
		vacuumCleaner.setBagType(temp[1]);
		temp = attribute[3].split("=");
		vacuumCleaner.setWandType(temp[1]);
		temp = attribute[4].split("=");
		vacuumCleaner.setMotorSpeedRegulation(Integer.parseInt(temp[1]));
		temp = attribute[5].split("=");
		vacuumCleaner.setCleaningWidth(Integer.parseInt(temp[1]));

		return vacuumCleaner;
	}

}
