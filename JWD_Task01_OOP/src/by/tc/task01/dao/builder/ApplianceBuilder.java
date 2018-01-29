package by.tc.task01.dao.builder;

import by.tc.task01.entity.Appliance;

public interface ApplianceBuilder {
	
	public Appliance build(String ApplinceType, String line);
}
