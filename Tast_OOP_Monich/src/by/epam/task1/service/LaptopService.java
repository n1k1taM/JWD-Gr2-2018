package by.epam.task1.service;

import java.util.List;

import by.epam.task1.bean.Laptop;

public interface LaptopService {
	
	List<Laptop> getLaptopsByBattetyCapacityLess(float battetyCapacity);
	List<Laptop> getLaptopsByBattetyCapacityMore(float battetyCapacity);
	List<Laptop> getLaptopsByBattetyCapacity(float bottomLineOfBattetyCapacity, float topLineOfBattetyCapacity);
	
	List<Laptop> getLaptopsByOperatingSystem(String operatingSytemName);
	
	List<Laptop> getLaptopsByMemoryROMLess(int memoryROM);
	List<Laptop> getLaptopsByMemoryROMMore(int memoryROM);
	List<Laptop> getLaptopsByMemoryROM(int bottomLineOfMemoryROM, int topLineOfMemoryROM);
	
	List<Laptop> getLaptopsBySystemMemoryLess(int systemMemory);
	List<Laptop> getLaptopsBySystemMemoryMore(int systemMemory);
	List<Laptop> getLaptopsBySystemMemory(int bottomLineOfSystemMemory, int topLineOfSystemMemory);
	
	
	
	List<Laptop> getLaptopsByFrequencyCPULess(float frequencyCPU);
	List<Laptop> getLaptopsByFrequencyCPUMore(float frequencyCPU);
	List<Laptop> getLaptopsByFrequencyCPU(float bottomLineOfFrequencyCPU, float topLineOfFrequencyCPU);
	
	List<Laptop> getLaptopsByDisplayInchesLess(int displayInches);
	List<Laptop> getLaptopsByDisplayInchesMore(int displayInches);
	List<Laptop> getLaptopsByDisplayInches(int bottomLineOfDisplayInches, int topLineOfDisplayInches);
	
		
}
