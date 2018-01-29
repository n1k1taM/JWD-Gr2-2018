package by.tc.task01.dao.builder.impl;

import by.tc.task01.dao.builder.ApplianceBuilder;
import by.tc.task01.entity.Laptop;

public class LaptopBuilder implements ApplianceBuilder{
	public Laptop build(String applianesType, String line) {
		Laptop laptop = new Laptop();
		
		String[] appliance = line.replace(";", "").split(" : ");
		String applianceParameterLine = appliance[1];
		String[] attribute = applianceParameterLine.replace(",", " ").split("  ");
		
		String[] temp = attribute[0].split("=");
		laptop.setBattetyCapacity(Float.parseFloat(temp[1]));
		temp = attribute[1].split("=");
		laptop.setOperatingSystem(temp[1]);
		temp = attribute[2].split("=");
		laptop.setMemoryROM(Integer.parseInt(temp[1]));
		temp = attribute[3].split("=");
		laptop.setSystemMemory(Integer.parseInt(temp[1]));
		temp = attribute[4].split("=");
		laptop.setFrequencyCPU(Float.parseFloat(temp[1]));
		return laptop;
	}
}
