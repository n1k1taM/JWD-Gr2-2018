package by.epam.task1.controller.commmand.impl;

import by.epam.task1.controller.commmand.Command;

public class EmptyComand implements Command{

	@Override
	public void execute(String attribute) {
		System.out.println("Команда не распознана. Пожалуйста, выберите другую команду.");
		
	}

}
