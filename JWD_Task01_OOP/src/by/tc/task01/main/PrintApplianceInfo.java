package by.tc.task01.main;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;
import by.tc.task01.entity.Oven;
import by.tc.task01.entity.Refrigerator;
import by.tc.task01.entity.Speakers;
import by.tc.task01.entity.TabletPC;
import by.tc.task01.entity.VacuumCleaner;

public class PrintApplianceInfo {

	public static void print(Appliance appliance) {
		if(appliance == null){
			System.out.println("Объект удовлетворяющий параметрам поиска");
		}else if (appliance.getClass() == Oven.class) {
			printOven((Oven) appliance);
		} else if (appliance.getClass() == Refrigerator.class) {
			printRefrigerator((Refrigerator) appliance);
		} else if (appliance.getClass() == Speakers.class) {
			printSpeakers((Speakers) appliance);
		} else if (appliance.getClass() == TabletPC.class) {
			printTabletPC((TabletPC) appliance);
		} else if (appliance.getClass() == VacuumCleaner.class) {
			printVacuumCleaner((VacuumCleaner) appliance);
		} else if (appliance.getClass() == Laptop.class) {
			printLaptop((Laptop) appliance);
		}

	}

	private static void printOven(Oven oven) {
		String stingOvenForm = "Oven [powerConsumtion=" + oven.getPowerConsumtion() + ", weight=" + oven.getWidth()
				+ ", capacity=" + oven.getCapacity() + ", depth=" + oven.getDepth() + ", height=" + oven.getHeight()
				+ ", width=" + oven.getWidth() + "]";
		System.out.println(stingOvenForm);
	}

	private static void printRefrigerator(Refrigerator refrigerator) {
		String stingRefrigeratorForm = "Refrigerator [powerConsumtion=" + refrigerator.getPowerConsumtion() + ", weight="
				+ refrigerator.getWeight() + ", freezerCapacity=" + refrigerator.getFreezerCapacity()
				+ ", overallCapacity=" + refrigerator.getOverallCapacity() + ", height=" + refrigerator.getHeight()
				+ ", width=" + refrigerator.getWidth() + "]";
		System.out.println(stingRefrigeratorForm);
	}

	private static void printSpeakers(Speakers speakers) {
		String stingSpeakersForm = "Speaker [powerConsumtion=" + speakers.getPowerConsumtion()+ ", numberOfSpeakers=" + speakers.getNumberOfSpeakers()
				+ ", minFrequencyRangeValue=" + speakers.getMinFrequencyRangeValue() + ", maxFrequencyRangeValue="
				+ speakers.getMaxFrequencyRangeValue() + ", cordLength=" + speakers.getCordLength() + "]";
		System.out.println(stingSpeakersForm);
	}

	private static void printTabletPC(TabletPC tabletPC) {
		String stingTabletPCForm = "TablePC [battetyCapacity=" + tabletPC.getBattetyCapacity()+ ", displayInches=" + tabletPC.getDisplayInches()+ ", memoryROM="
				+ tabletPC.getMemoryROM() + ", flashMemoryCapacity=" + tabletPC.getFlashMemoryCapacity() + ", color=" + tabletPC.getColor() + "]";
		System.out.println(stingTabletPCForm);
	}

	private static void printLaptop(Laptop laptop) {
		String stingLaptopForm ="Laptop [battetyCapacity=" + laptop.getBattetyCapacity() + ", operatingSystem=" + laptop.getOperatingSystem() + ", memoryROM="
				+ laptop.getMemoryROM() + ", systemMemory=" + laptop.getSystemMemory() + ", frequencyCPU=" + laptop.getFrequencyCPU() + ", displayInches="
				+ laptop.getDisplayInches() + "]";
		System.out.println(stingLaptopForm);
	}

	private static void printVacuumCleaner(VacuumCleaner vacuumCleaner) {
		String stingVacuumCleanerForm ="VacuumCleaner [powerConsumtion=" + vacuumCleaner.getPowerConsumtion() + ", filterType=" + vacuumCleaner.getFilterType() + ", bagType="
				+ vacuumCleaner.getBagType() + ", wandType=" + vacuumCleaner.getWandType() + ", motorSpeedRegulation=" + vacuumCleaner.getMotorSpeedRegulation()
				+ ", cleaningWidth=" + vacuumCleaner.getCleaningWidth() + "]";
		System.out.println(stingVacuumCleanerForm);
	}

}
