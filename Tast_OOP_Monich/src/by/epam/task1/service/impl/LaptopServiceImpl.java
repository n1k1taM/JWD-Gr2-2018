package by.epam.task1.service.impl;



import java.util.ArrayList;
import java.util.List;

import by.epam.task1.bean.Laptop;
import by.epam.task1.service.LaptopService;
import by.epam.task1.store.DBStore;

public class LaptopServiceImpl implements LaptopService{

	@Override
	public List<Laptop> getLaptopsByBattetyCapacityLess(float battetyCapacity) {
		List<Laptop> laptopsForUser = new ArrayList<Laptop>();
		List<Laptop> allLaptops = DBStore.store.getLaptopsList();
		for (Laptop laptop : allLaptops) {
			if(laptop.getBattetyCapacity() < battetyCapacity){
				laptopsForUser.add(laptop);
			}
		}
		return laptopsForUser;
	}

	@Override
	public List<Laptop> getLaptopsByBattetyCapacityMore(float battetyCapacity) {
		List<Laptop> laptopsForUser = new ArrayList<Laptop>();
		List<Laptop> allLaptops = DBStore.store.getLaptopsList();
		for (Laptop laptop : allLaptops) {
			if(laptop.getBattetyCapacity() > battetyCapacity){
				laptopsForUser.add(laptop);
			}
		}
		return laptopsForUser;
	}
	
	

	@Override
	public List<Laptop> getLaptopsByBattetyCapacity(float bottomLineOfBattetyCapacity, float topLineOfBattetyCapacity) {
		List<Laptop> laptopsForUser = new ArrayList<Laptop>();
		List<Laptop> allLaptops = DBStore.store.getLaptopsList();
		for (Laptop laptop : allLaptops) {
			if((laptop.getBattetyCapacity() > bottomLineOfBattetyCapacity)&&(laptop.getBattetyCapacity() < topLineOfBattetyCapacity)){
				laptopsForUser.add(laptop);
			}
		}
		return laptopsForUser;
	}

	@Override
	public List<Laptop> getLaptopsByOperatingSystem(String operatingSytemName) {
		List<Laptop> laptopsForUser = new ArrayList<Laptop>();
		List<Laptop> allLaptops = DBStore.store.getLaptopsList();
		
		
		for (Laptop laptop : allLaptops) {
			if(laptop.getOperatingSystem().equals(operatingSytemName) ){
				laptopsForUser.add(laptop);
			}
		}
		
		return laptopsForUser;
	}

	
	@Override
	public List<Laptop> getLaptopsByMemoryROMLess(int memoryROM) {
		List<Laptop> laptopsForUser = new ArrayList<Laptop>();
		List<Laptop> allLaptops = DBStore.store.getLaptopsList();
		for (Laptop laptop : allLaptops) {
			if(laptop.getMemoryROM() < memoryROM){
				laptopsForUser.add(laptop);
			}
		}
		return laptopsForUser;
	}

	@Override
	public List<Laptop> getLaptopsByMemoryROMMore(int memoryROM) {
		List<Laptop> laptopsForUser = new ArrayList<Laptop>();
		List<Laptop> allLaptops = DBStore.store.getLaptopsList();
		for (Laptop laptop : allLaptops) {
			if(laptop.getMemoryROM() > memoryROM){
				laptopsForUser.add(laptop);
			}
		}
		return laptopsForUser;
	}

	@Override
	public List<Laptop> getLaptopsByMemoryROM(int bottomLineOfMemoryROM, int topLineOfMemoryROM) {
		List<Laptop> laptopsForUser = new ArrayList<Laptop>();
		List<Laptop> allLaptops = DBStore.store.getLaptopsList();
		for (Laptop laptop : allLaptops) {
			if((laptop.getMemoryROM() > bottomLineOfMemoryROM) && (laptop.getMemoryROM() < topLineOfMemoryROM)){
				laptopsForUser.add(laptop);
			}
		}
		return laptopsForUser;
	}

	@Override
	public List<Laptop> getLaptopsBySystemMemoryLess(int systemMemory) {
		List<Laptop> laptopsForUser = new ArrayList<Laptop>();
		List<Laptop> allLaptops = DBStore.store.getLaptopsList();
		for (Laptop laptop : allLaptops) {
			if(laptop.getSystemMemory() < systemMemory){
				laptopsForUser.add(laptop);
			}
		}
		return laptopsForUser;
	}

	@Override
	public List<Laptop> getLaptopsBySystemMemoryMore(int systemMemory) {
		List<Laptop> laptopsForUser = new ArrayList<Laptop>();
		List<Laptop> allLaptops = DBStore.store.getLaptopsList();
		for (Laptop laptop : allLaptops) {
			if(laptop.getSystemMemory() < systemMemory){
				laptopsForUser.add(laptop);
			}
		}
		return laptopsForUser;
	}

	@Override
	public List<Laptop> getLaptopsBySystemMemory(int bottomLineOfSystemMemory, int topLineOfSystemMemory) {
		List<Laptop> laptopsForUser = new ArrayList<Laptop>();
		List<Laptop> allLaptops = DBStore.store.getLaptopsList();
		for (Laptop laptop : allLaptops) {
			if((laptop.getSystemMemory() > bottomLineOfSystemMemory)&&(laptop.getSystemMemory() < topLineOfSystemMemory)){
				laptopsForUser.add(laptop);
			}
		}
		return laptopsForUser;
	}

	
	@Override
	public List<Laptop> getLaptopsByFrequencyCPULess(float frequencyCPU) {
		List<Laptop> laptopsForUser = new ArrayList<Laptop>();
		List<Laptop> allLaptops = DBStore.store.getLaptopsList();
		for (Laptop laptop : allLaptops) {
			if(laptop.getFrequencyCPU() < frequencyCPU){
				laptopsForUser.add(laptop);
			}
		}
		return laptopsForUser;
	}

	@Override
	public List<Laptop> getLaptopsByFrequencyCPUMore(float frequencyCPU) {
		List<Laptop> laptopsForUser = new ArrayList<Laptop>();
		List<Laptop> allLaptops = DBStore.store.getLaptopsList();
		for (Laptop laptop : allLaptops) {
			if(laptop.getFrequencyCPU() > frequencyCPU){
				laptopsForUser.add(laptop);
			}
		}
		return laptopsForUser;
	}

	@Override
	public List<Laptop> getLaptopsByFrequencyCPU(float bottomLineOfFrequencyCPU, float topLineOfFrequencyCPU) {
		List<Laptop> laptopsForUser = new ArrayList<Laptop>();
		List<Laptop> allLaptops = DBStore.store.getLaptopsList();
		for (Laptop laptop : allLaptops) {
			if((laptop.getFrequencyCPU() > bottomLineOfFrequencyCPU)&&(laptop.getFrequencyCPU() < topLineOfFrequencyCPU)){
				laptopsForUser.add(laptop);
			}
		}
		return laptopsForUser;
	}

	@Override
	public List<Laptop> getLaptopsByDisplayInchesLess(int displayInches) {
		List<Laptop> laptopsForUser = new ArrayList<Laptop>();
		List<Laptop> allLaptops = DBStore.store.getLaptopsList();
		for (Laptop laptop : allLaptops) {
			if(laptop.getDisplayInches() < displayInches){
				laptopsForUser.add(laptop);
			}
		}
		return laptopsForUser;
	}

	@Override
	public List<Laptop> getLaptopsByDisplayInchesMore(int displayInches) {
		List<Laptop> laptopsForUser = new ArrayList<Laptop>();
		List<Laptop> allLaptops = DBStore.store.getLaptopsList();
		for (Laptop laptop : allLaptops) {
			if(laptop.getDisplayInches() > displayInches){
				laptopsForUser.add(laptop);
			}
		}
		return laptopsForUser;
	}

	@Override
	public List<Laptop> getLaptopsByDisplayInches(int bottomLineOfDisplayInches, int topLineOfDisplayInches) {
		List<Laptop> laptopsForUser = new ArrayList<Laptop>();
		List<Laptop> allLaptops = DBStore.store.getLaptopsList();
		for (Laptop laptop : allLaptops) {
			if((laptop.getDisplayInches() > bottomLineOfDisplayInches)&&(laptop.getDisplayInches() < topLineOfDisplayInches)){
				laptopsForUser.add(laptop);
			}
		}
		return laptopsForUser;
	}

	

	

	

}
