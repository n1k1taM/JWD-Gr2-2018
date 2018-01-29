package by.tc.task01.dao.builder.impl;


import by.tc.task01.dao.builder.ApplianceBuilder;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Speakers;

public class SpeakersBuilder implements ApplianceBuilder{

	
	public Appliance build(String ApplinceType, String line) {
		Speakers speakers = new Speakers();
//		String[] attribute = line.replace(",", " ").split("  ");
		String[] appliance = line.replace(";", "").split(" : ");
		String applianceParameterLine = appliance[1];
		String[] attribute = applianceParameterLine.replace(",", " ").split("  ");
		
		String[] temp = attribute[0].split("=");
		speakers.setPowerConsumtion(Integer.parseInt(temp[1]));
		temp = attribute[1].split("=");
		speakers.setNumberOfSpeakers(Integer.parseInt(temp[1]));
		temp = attribute[2].split("=");
		String[] frequency = temp[1].split("-");
		speakers.setMinFrequencyRangeValue(Float.parseFloat(frequency[0]));
		speakers.setMaxFrequencyRangeValue(Float.parseFloat(frequency[1]));
		temp = attribute[3].split("=");
		speakers.setCordLength(Integer.parseInt(temp[1]));;
		
		return speakers;
	}

}
