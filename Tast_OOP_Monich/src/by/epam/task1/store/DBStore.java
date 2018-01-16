package by.epam.task1.store;

import java.util.ArrayList;
import java.util.List;

import by.epam.task1.bean.Laptop;
import by.epam.task1.bean.Oven;
import by.epam.task1.bean.Refrigerator;
import by.epam.task1.bean.Speaker;
import by.epam.task1.bean.TablePC;
import by.epam.task1.bean.VacuumCleaner;

public final class DBStore {
	
	public static final DBStore store = new DBStore();
	
	private List<Laptop> laptopsList = new ArrayList<Laptop>();
	private List<Oven> ovensList = new ArrayList<Oven>();
	private List<Refrigerator> refrigeratorsLit = new ArrayList<Refrigerator>();
	private List<Speaker> speakerList = new ArrayList<Speaker>();
	private List<TablePC> tablePCsList = new ArrayList<TablePC>();
	private List<VacuumCleaner> vacuumCleanersList = new ArrayList<VacuumCleaner>();
	
	private DBStore() {
		super();
	}

	public List<Laptop> getLaptopsList() {
		return laptopsList;
	}
	
	public void setLaptopsList(List<Laptop> laptopsList) {
		this.laptopsList = laptopsList;
	}
	
	public List<Oven> getOvensList() {
		return ovensList;
	}
	
	public void setOvensList(List<Oven> ovensList) {
		this.ovensList = ovensList;
	}
	
	public List<Refrigerator> getRefrigeratorsLit() {
		return refrigeratorsLit;
	}
	
	public void setRefrigeratorsLit(List<Refrigerator> refrigeratorsLit) {
		this.refrigeratorsLit = refrigeratorsLit;
	}
	
	public List<Speaker> getSpeakerList() {
		return speakerList;
	}
	
	public void setSpeakerList(List<Speaker> speakerList) {
		this.speakerList = speakerList;
	}
	
	public List<TablePC> getTablePCsList() {
		return tablePCsList;
	}
	
	public void setTablePCsList(List<TablePC> tablePCsList) {
		this.tablePCsList = tablePCsList;
	}
	
	public List<VacuumCleaner> getVacuumCleanersList() {
		return vacuumCleanersList;
	}
	
	public void setVacuumCleanersList(List<VacuumCleaner> vacuumCleanersList) {
		this.vacuumCleanersList = vacuumCleanersList;
	}
	
	
	
	
	
	
}
