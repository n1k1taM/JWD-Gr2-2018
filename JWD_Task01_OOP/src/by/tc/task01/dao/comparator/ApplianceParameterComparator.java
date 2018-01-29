package by.tc.task01.dao.comparator;

public class ApplianceParameterComparator {
	public static boolean match(String fileLine, String applianceType, String parameter, String value) {
		boolean matchingResault = false;
		if (fileLine.length() != 0) {
			String[] appliance = fileLine.split(" : ");
			String applianceName = appliance[0];
			String applianceParameter = appliance[1];

			if (applianceType.toUpperCase().equals(applianceName.toUpperCase())) {
				String[] applianceParameterArray = applianceParameter.replace(",", " ").replace(";", "").split("  ");
				for (int i = 0; i < applianceParameterArray.length; i++) {
					String temp = applianceParameterArray[i];
					if(temp.toUpperCase().equals(new String(parameter + "=" + value).toUpperCase())){
						matchingResault = true;
						break;
					}
				}
			}
		}
		return matchingResault;
	}
}
