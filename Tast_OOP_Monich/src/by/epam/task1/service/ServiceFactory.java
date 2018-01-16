package by.epam.task1.service;

import by.epam.task1.service.impl.InitializationServiceImpl;

public final class ServiceFactory {
	public static final ServiceFactory instance = new ServiceFactory();
	
	private InitializationService initializationService = new InitializationServiceImpl(); 
	
	private ServiceFactory() {
		 
	}

	public InitializationService getInitializationService() {
		return initializationService;
	}

	
	
	
	
	
	

	
}
