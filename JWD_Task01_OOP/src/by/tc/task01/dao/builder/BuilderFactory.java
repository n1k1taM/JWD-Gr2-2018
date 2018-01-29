package by.tc.task01.dao.builder;

import by.tc.task01.dao.builder.impl.LaptopBuilder;
import by.tc.task01.dao.builder.impl.OvenBuilder;
import by.tc.task01.dao.builder.impl.RefrigeratorBuilder;
import by.tc.task01.dao.builder.impl.SpeakersBuilder;
import by.tc.task01.dao.builder.impl.TabletPCBuilder;
import by.tc.task01.dao.builder.impl.VacuumCleanerBuilder;


public class BuilderFactory {
	private static final BuilderFactory instance = new BuilderFactory();
	
	private BuilderFactory(){
		
	}
	public static BuilderFactory getInstance(){
		return instance;
	}
	
	public ApplianceBuilder getBuilder(String typeApplince){
		typeApplince = typeApplince.toUpperCase();
		ApplianceBuilder builder = null;
		switch (typeApplince) {
		case "LAPTOP":
			builder = new LaptopBuilder();
			break;
		
		case "OVEN":
			builder = new OvenBuilder();
			break;	
		
		case "REFRIGERATOR":
			builder = new RefrigeratorBuilder();
			break;	
			
		case "SPEAKERS":
			builder = new SpeakersBuilder();
			break;	
			
		case "TABLETPC":
			builder = new TabletPCBuilder();
			break;	
		
		case "VACUUMCLEANER":
			builder = new VacuumCleanerBuilder();
			break;	
		default:
			break;
		}
		return builder;
	}
	
}
