package by.epam.task1.controller.command.impl;

import by.epam.task1.controller.command.Command;

public class EmptyComand implements Command{

	@Override
	public void execute(String attribute) {
		System.out.println("Команда не распознана. Пожалуйста, выберите другую команду.");
		
	}

}
