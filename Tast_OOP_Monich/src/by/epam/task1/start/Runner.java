package by.epam.task1.start;

import by.epam.task1.controller.Controller;

public class Runner {

	public static void main(String[] args) {
		Controller.showResault("LOAD_DATA", null);
		Controller.showResault("GET_LAPTOP", "os Windows");
		Controller.showResault("GET_LAPTOP", "cpu < 2");
	}

}
