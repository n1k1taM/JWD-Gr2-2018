package by.epam.task1.service;

import by.epam.task1.service.impl.InitializationServiceImpl;
import by.epam.task1.service.impl.LaptopServiceImpl;

public final class ServiceFactory {
	public static final ServiceFactory instance = new ServiceFactory();
	
	private InitializationService initializationService = new InitializationServiceImpl(); 
	private LaptopService laptopService = new LaptopServiceImpl();
	
	private ServiceFactory() {
		 
	}

	public InitializationService getInitializationService() {
		return initializationService;
	}

	public LaptopService getLaptopService() {
		return laptopService;
	}

	

	
	
	
	
	
	

	
}
