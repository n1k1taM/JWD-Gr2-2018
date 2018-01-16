package by.epam.task1.controller.commad.impl;


import by.epam.task1.controller.commmand.Command;
import by.epam.task1.service.LaptopService;
import by.epam.task1.service.ServiceFactory;

public class GetLaptop implements Command {

	@Override
	public void execute(String attribute) {
		LaptopService ls = ServiceFactory.instance.getgetLs();
		ls.getLaptop();
		
		String param1 = "asdasd";
		
	}

}
