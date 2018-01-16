package by.epam.task1.controller;

import by.epam.task1.controller.commmand.Command;
import by.epam.task1.controller.commmand.enums.CommandName;
import by.epam.task1.controller.commmand.impl.EmptyComand;
import by.epam.task1.controller.commmand.impl.LoadDataCommand;

public final class Controller {
	public static final Controller CONTROLLER = new Controller();

	private Controller() {
		// TODO Auto-generated constructor stub
	}
	
	public static void showResault(String commandName, String attribute){
		//TODO make try catch
		CommandName name = CommandName.valueOf(commandName.toUpperCase());
		Command command = Controller.getCommand(name);
		command.execute(attribute);
	}
	
	
	
	
	
	public static Command getCommand(CommandName commandName) {
		Command command = null;	
		switch(commandName){
			case LOAD_DATA: {command = new LoadDataCommand(); break;}
			case GET_LAPTOP: {command = new EmptyComand(); break;} 
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
