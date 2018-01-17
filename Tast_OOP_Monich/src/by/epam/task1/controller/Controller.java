package by.epam.task1.controller;

import by.epam.task1.controller.command.Command;
import by.epam.task1.controller.command.enums.CommandName;
import by.epam.task1.controller.command.impl.EmptyComand;
import by.epam.task1.controller.command.impl.GetLaptopCommand;
import by.epam.task1.controller.command.impl.LoadDataCommand;

public final class Controller {
	public static final Controller CONTROLLER = new Controller();

	private Controller() {
		super();
	}
	
	public static void showResault(String commandName, String attribute){
		//TODO make try catch
		System.out.println(commandName+"\t"+attribute);
		CommandName name = CommandName.valueOf(commandName.toUpperCase());
		Command command = Controller.getCommand(name);
		command.execute(attribute);
	}
	
	
	
	
	
	public static Command getCommand(CommandName commandName) {
		Command command = null;	
		switch(commandName){
			case LOAD_DATA: {command = new LoadDataCommand(); break;}
			case GET_LAPTOP: {command = new GetLaptopCommand(); break;} 
			case GET_OVENS: {command = new EmptyComand(); break;}
			case GET_REFRIGERATOR: {command = new EmptyComand(); break;}
			case GET_VACUUM_CLEANER: {command = new EmptyComand(); break;}
			case GET_TABLE_PC: {command = new EmptyComand(); break;}
			case GET_SPEAKER: {command = new EmptyComand(); break;}
			default: {command = new EmptyComand(); break;}
		}
		return command;
	}
	
	
}
