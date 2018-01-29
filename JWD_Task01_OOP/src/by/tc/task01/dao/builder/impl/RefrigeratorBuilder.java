package by.tc.task01.dao.builder.impl;


import by.tc.task01.dao.builder.ApplianceBuilder;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Refrigerator;

public class RefrigeratorBuilder implements ApplianceBuilder{

	@Override
	public Appliance build(String ApplinceType, String line) {
		Refrigerator refrigerator = new Refrigerator();
//		String[] attribute = line.replace(",", " ").split("  ");
		String[] appliance = line.replace(";", "").split(" : ");
		String applianceParameterLine = appliance[1];
		String[] attribute = applianceParameterLine.replace(",", " ").split("  ");
		
		
		String[] temp = attribute[0].split("=");
		refrigerator.setPowerConsumtion(Integer.parseInt(temp[1]));
		temp = attribute[1].split("=");
		refrigerator.setWeight(Integer.parseInt(temp[1]));
		temp = attribute[2].split("=");
		refrigerator.setFreezerCapacity(Integer.parseInt(temp[1]));
		temp = attribute[3].split("=");
		refrigerator.setOverallCapacity(Float.parseFloat(temp[1]));
		temp = attribute[4].split("=");
		refrigerator.setHeight(Integer.parseInt(temp[1]));
		temp = attribute[5].split("=");
		refrigerator.setWidth(Integer.parseInt(temp[1]));

		return refrigerator;
	}

}
