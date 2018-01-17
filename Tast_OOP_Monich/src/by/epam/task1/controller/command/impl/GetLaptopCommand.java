package by.epam.task1.controller.command.impl;

import java.util.List;

import by.epam.task1.bean.Laptop;
import by.epam.task1.controller.command.Command;
import by.epam.task1.service.LaptopService;
import by.epam.task1.service.ServiceFactory;

public class GetLaptopCommand implements Command {

	@Override
	public void execute(String attribute) {
		LaptopService laptopService = ServiceFactory.instance.getLaptopService();
		
		
		String[] arr = attribute.split(" ");
		
		List<Laptop> laptops = null;
		switch (arr[0].toLowerCase()) {
		case "battery_capacity":
			laptops = getLaptopByBatteryCapacity(arr[1], arr[2], laptopService);
			break;
		
		case "os":
			laptops = laptopService.getLaptopsByOperatingSystem(arr[1]);
			break;
			
		case "memory_rom":
			laptops = getLaptopByMemoryROM(arr[1], arr[2], laptopService);
			break;
			
		case "system_memory":
			laptops = getLaptopBySystemMemory(arr[1], arr[2], laptopService);
			break;
			
		case "cpu":
			laptops = getLaptopsByCPU(arr[1], arr[2], laptopService);
			break;
			
		case "displayInches":
			laptops = getLaptopByDisplayInches(arr[1], arr[2], laptopService);
			break;

		}
		
		
		System.out.println(laptops);

	}

	private List<Laptop> getLaptopByBatteryCapacity(String attribute1, String attribute2, LaptopService laptopService) {
		List<Laptop> laptops = null;
		if (attribute1.equals(">")) {
			laptops = laptopService.getLaptopsByBattetyCapacityMore(Float.parseFloat(attribute2));
		} else if (attribute1.equals("<")) {
			laptops = laptopService.getLaptopsByBattetyCapacityLess(Float.parseFloat(attribute2));
		} else {
			laptops = laptopService.getLaptopsByBattetyCapacity(Float.parseFloat(attribute1),
					Float.parseFloat(attribute2));
		}
		return laptops;
	}
	
	private List<Laptop> getLaptopsByCPU(String attribute1, String attribute2, LaptopService laptopService) {
		List<Laptop> laptops = null;
		if (attribute1.equals(">")) {
			laptops = laptopService.getLaptopsByFrequencyCPUMore(Float.parseFloat(attribute2));
		} else if (attribute1.equals("<")) {
			laptops = laptopService.getLaptopsByFrequencyCPULess(Float.parseFloat(attribute2));
		} else {
			laptops = laptopService.getLaptopsByFrequencyCPU(Float.parseFloat(attribute1),
					Float.parseFloat(attribute2));
		}
		return laptops;
	}

	private List<Laptop> getLaptopByMemoryROM(String attribute1, String attribute2, LaptopService laptopService) {
		List<Laptop> laptops = null;
		if (attribute1.equals(">")) {
			laptops = laptopService.getLaptopsByMemoryROMMore(Integer.parseInt(attribute2));
		} else if (attribute1.equals("<")) {
			laptops = laptopService.getLaptopsByMemoryROMLess(Integer.parseInt(attribute2));
		} else {
			laptops = laptopService.getLaptopsByMemoryROM(Integer.parseInt(attribute1),
					Integer.parseInt(attribute2));
		}
		return laptops;
	}
	
	private List<Laptop> getLaptopByDisplayInches(String attribute1, String attribute2, LaptopService laptopService) {
		List<Laptop> laptops = null;
		if (attribute1.equals(">")) {
			laptops = laptopService.getLaptopsByDisplayInchesMore(Integer.parseInt(attribute2));
		} else if (attribute1.equals("<")) {
			laptops = laptopService.getLaptopsByDisplayInchesLess(Integer.parseInt(attribute2));
		} else {
			laptops = laptopService.getLaptopsByDisplayInches(Integer.parseInt(attribute1),
					Integer.parseInt(attribute2));
		}
		return laptops;
	}
	
	private List<Laptop> getLaptopBySystemMemory(String attribute1, String attribute2, LaptopService laptopService) {
		List<Laptop> laptops = null;
		if (attribute1.equals(">")) {
			laptops = laptopService.getLaptopsBySystemMemoryMore(Integer.parseInt(attribute2));
		} else if (attribute1.equals("<")) {
			laptops = laptopService.getLaptopsBySystemMemoryLess(Integer.parseInt(attribute2));
		} else {
			laptops = laptopService.getLaptopsBySystemMemory(Integer.parseInt(attribute1),
					Integer.parseInt(attribute2));
		}
		return laptops;
	}
	
}
