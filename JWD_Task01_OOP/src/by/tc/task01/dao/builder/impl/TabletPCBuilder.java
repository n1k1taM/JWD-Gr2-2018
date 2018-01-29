package by.tc.task01.dao.builder.impl;


import by.tc.task01.dao.builder.ApplianceBuilder;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.TabletPC;

public class TabletPCBuilder implements ApplianceBuilder{

	
	public Appliance build(String ApplinceType, String line) {
		TabletPC tabletPC = new TabletPC();
//		String[] attribute = line.replace(",", " ").split("  ");
		String[] appliance = line.replace(";", "").split(" : ");
		String applianceParameterLine = appliance[1];
		String[] attribute = applianceParameterLine.replace(",", " ").split("  ");
		
		String[] temp = attribute[0].split("=");
		tabletPC.setBattetyCapacity(Float.parseFloat(temp[1]));
		temp = attribute[1].split("=");
		tabletPC.setDisplayInches(Integer.parseInt(temp[1]));
		temp = attribute[2].split("=");
		tabletPC.setMemoryROM(Integer.parseInt(temp[1]));;
		temp = attribute[3].split("=");
		tabletPC.setFlashMemoryCapacity(Integer.parseInt(temp[1]));;
		temp = attribute[4].split("=");
		tabletPC.setColor(temp[1].replace("\t", ""));;
		
		return tabletPC;
	}

}
