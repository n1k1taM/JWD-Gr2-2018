package by.epam.task1.service;

import by.epam.task1.bean.Laptop;

public interface LaptopService {
	
	void getLaptopsByBattetyCapacityLess(float battetyCapacity);
	void getLaptopsByBattetyCapacityMore(float battetyCapacity);
	void getLaptopsByBattetyCapacity(float bottomLineOfBattetyCapacity, float topLineOfBattetyCapacity);
	
	void getLaptopsByOperatingSystem(String operatingSytemName);
	
	void getLaptopsByMemoryROMLess(int powerConsumption);
	void getLaptopsByMemoryROMMore(int powerConsumption);
	void getLaptopsByMemoryROM(int bottomLineOfMemoryROM, int topLineOfMemoryROM);
	
	void getLaptopsBySystemMemoryLess(int systemMemory);
	void getLaptopsBySystemMemoryMore(int systemMemory);
	void getLaptopsBySystemMemory(int bottomLineOfSystemMemory, int topLineOfSystemMemory);
	
	void getLaptopsByFrequencyCPULess(int frequencyCPU);
	void getLaptopsByFrequencyCPUMore(int frequencyCPU);
	void getLaptopsByFrequencyCPU(int bottomLineOfFrequencyCPU, int topLineOfFrequencyCPU);
	
	void getLaptopsByFrequencyCPULess(float frequencyCPU);
	void getLaptopsByFrequencyCPUMore(float frequencyCPU);
	void getLaptopsByFrequencyCPU(float bottomLineOfFrequencyCPU, float topLineOfFrequencyCPU);
	
	void getLaptopsByDisplayInchesLess(int displayInches);
	void getLaptopsByDisplayInchesMore(int displayInches);
	void getLaptopsByDisplayInches(int bottomLineOfDisplayInches, int topLineOfDisplayInches);
	
	Laptop buildLaptop(String attribute);
		
}
