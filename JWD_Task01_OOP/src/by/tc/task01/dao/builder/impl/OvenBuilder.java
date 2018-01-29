package by.tc.task01.dao.builder.impl;


import by.tc.task01.dao.builder.ApplianceBuilder;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Oven;

public class OvenBuilder implements ApplianceBuilder{

	@Override
	public Appliance build(String ApplinceType, String line) {
		Oven oven = new Oven();
//		String[] attribute = line.replace(",", " ").split("  ");
		
		String[] appliance = line.replace(";", "").split(" : ");
		String applianceParameterLine = appliance[1];
		String[] attribute = applianceParameterLine.replace(",", " ").split("  ");
		
		String[] temp = attribute[0].split("=");
		oven.setPowerConsumtion(Integer.parseInt(temp[1]));
		temp = attribute[1].split("=");
		oven.setWeight(Integer.parseInt(temp[1]));
		temp = attribute[2].split("=");
		oven.setCapacity(Integer.parseInt(temp[1]));
		temp = attribute[3].split("=");
		oven.setDepth(Float.parseFloat(temp[1]));
		temp = attribute[4].split("=");
		oven.setHeight(Float.parseFloat(temp[1]));
		temp = attribute[5].split("=");
		oven.setWidth(Float.parseFloat(temp[1]));
		return oven;
	}
	

}
