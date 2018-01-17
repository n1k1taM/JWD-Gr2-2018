package by.epam.task1.service.impl;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import by.epam.task1.bean.Laptop;
import by.epam.task1.bean.Oven;
import by.epam.task1.bean.Refrigerator;
import by.epam.task1.bean.Speaker;
import by.epam.task1.bean.TablePC;
import by.epam.task1.bean.VacuumCleaner;
import by.epam.task1.service.InitializationService;
import by.epam.task1.store.DBStore;

public class InitializationServiceImpl implements InitializationService {

	private static final String FILE_PATH = "D:\\Програмирование\\reposit\\Tast_OOP_Monich\\src\\resource\\product.txt";

	@Override
	public void loadData() {

		List<String> line = null;

		try {
			line = Files.readAllLines(Paths.get(FILE_PATH), StandardCharsets.UTF_8);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		List<Laptop> laptopsList = new ArrayList<Laptop>();
		List<Oven> ovensList = new ArrayList<Oven>();
		List<Refrigerator> refrigeratorsLit = new ArrayList<Refrigerator>();
		List<Speaker> speakerList = new ArrayList<Speaker>();
		List<TablePC> tablePCsList = new ArrayList<TablePC>();
		List<VacuumCleaner> vacuumCleanersList = new ArrayList<VacuumCleaner>();

		for (String str : line) {
			if (str.length() != 0) {
				String[] arr = str.split(" : ");

				// System.out.println(arr[0]);
				// System.out.println(arr[1]);

				switch (arr[0].toLowerCase()) {
				case "laptop": laptopsList.add(buildLaptop(arr[1])); break;
				case "oven": ovensList.add(buildOven(arr[1])); break;
				case "refrigerator": refrigeratorsLit.add(buildRefrigerator(arr[1])); break;
				case "vacuumcleaner": vacuumCleanersList.add(buildVacuumCleaner(arr[1])); break;
				case "tabletpc": tablePCsList.add(buildTablePC(arr[1])); break;
				case "speakers": speakerList.add(buildSpeaker(arr[1]));break;

				default:
					break;
				}
			}

		}
		
		DBStore.store.setLaptopsList(laptopsList);
		DBStore.store.setOvensList(ovensList);
		DBStore.store.setRefrigeratorsLit(refrigeratorsLit);
		DBStore.store.setVacuumCleanersList(vacuumCleanersList);
		DBStore.store.setSpeakerList(speakerList);
		
		
		
		

	}

	@Override
	public void dropData() {
		// TODO Auto-generated method stub

	}

	private Laptop buildLaptop(String str) {
		Laptop laptop = new Laptop();
		String[] attribute = str.replace(",", " ").split("  ");
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

	private Oven buildOven(String str) {
		Oven oven = new Oven();
		String[] attribute = str.replace(",", " ").split("  ");
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
		temp = attribute[5].replace(";", "").split("=");
		oven.setWidth(Float.parseFloat(temp[1]));

		return oven;
	}

	private Refrigerator buildRefrigerator(String str) {
		Refrigerator refrigerator = new Refrigerator();
		String[] attribute = str.replace(",", " ").split("  ");
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
	
	private VacuumCleaner buildVacuumCleaner(String str) {
		VacuumCleaner vacuumCleaner = new VacuumCleaner();
		String[] attribute = str.replace(",", " ").split("  ");
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
	
	private TablePC buildTablePC(String str) {
		TablePC tablePC = new TablePC();
		String[] attribute = str.replace(",", " ").split("  ");
		String[] temp = attribute[0].split("=");
		tablePC.setBattetyCapacity(Float.parseFloat(temp[1]));
		temp = attribute[1].split("=");
		tablePC.setDisplayInches(Integer.parseInt(temp[1]));
		temp = attribute[2].split("=");
		tablePC.setMemoryROM(Integer.parseInt(temp[1]));;
		temp = attribute[3].split("=");
		tablePC.setFlashMemoryCapacity(Integer.parseInt(temp[1]));;
		temp = attribute[4].split("=");
		tablePC.setColor(temp[1].replace("\t", ""));;
		
		return tablePC;
	}
	
	private Speaker buildSpeaker(String str) {
		Speaker speaker = new Speaker();
		String[] attribute = str.replace(",", " ").split("  ");
		String[] temp = attribute[0].split("=");
		speaker.setPowerConsumtion(Integer.parseInt(temp[1]));
		temp = attribute[1].split("=");
		speaker.setNumberOfSpeakers(Integer.parseInt(temp[1]));
		temp = attribute[2].split("=");
		String[] frequency = temp[1].split("-");
		speaker.setMinFrequencyRangeValue(Float.parseFloat(frequency[0]));
		speaker.setMaxFrequencyRangeValue(Float.parseFloat(frequency[1]));
		temp = attribute[3].split("=");
		speaker.setCordLength(Integer.parseInt(temp[1]));;
		
		return speaker;
	}

}
