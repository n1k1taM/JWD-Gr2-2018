package by.epam.task1.service.impl;

import java.io.IOException;
import java.io.InputStream;
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

	private static final String FILE_PATH = "D:\\Програмирование\\workspace\\Tast_OOP_Monich\\src\\resource\\product.txt";

	@Override
	public void loadData() {

		List<String> line = null;

		try {
			line = Files.readAllLines(Paths.get(FILE_PATH), StandardCharsets.UTF_8);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (String str : line) {
			System.out.println(str);
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
				
//				System.out.println(arr[0]);
//				System.out.println(arr[1]);
				
				switch (arr[0].toLowerCase()) {
				case "laptop": laptopsList.add(buildLaptop(arr[1])); break;
//				case "oven": ovensList.add(buildLaptop(arr[1])); break;

				default:
					break;
				}
			}

		}
		System.out.println("----------------------------------------------------");
		System.out.println(laptopsList);
		DBStore.store.setLaptopsList(laptopsList);

	}

	@Override
	public void dropData() {
		// TODO Auto-generated method stub

	}
	private Laptop buildLaptop(String str){
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
//	private Oven buildOven(String str){
//		Oven oven = new Oven();
//		 String[] attribute = str.replace(",", " ").split("  ");
//		 String[] temp = attribute[0].split("=");
//		 oven.setPowerConsumtion(Integer.parseInt(temp[1]));
//		 temp = attribute[1].split("=");
//		 oven.setWeight(Integer.parseInt(temp[1]));
//		 temp = attribute[2].split("=");
//		 oven.setCapacity(Integer.parseInt(temp[1]));
//		 temp = attribute[3].split("=");
//		 oven.setSystemMemory(Integer.parseInt(temp[1]));
//		 temp = attribute[4].split("=");
//		 oven.setFrequencyCPU(Float.parseFloat(temp[1]));
//		 return oven;
//	}

}
