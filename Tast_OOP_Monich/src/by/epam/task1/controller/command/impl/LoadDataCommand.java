package by.epam.task1.controller.command.impl;

import by.epam.task1.controller.command.Command;
import by.epam.task1.service.InitializationService;
import by.epam.task1.service.ServiceFactory;

public class LoadDataCommand implements Command{

	@Override
	public void execute(String attribute) {
		ServiceFactory serviceFactory = ServiceFactory.instance;
		InitializationService initializationService = serviceFactory.getInitializationService();
		initializationService.loadData();
		
	}

}
