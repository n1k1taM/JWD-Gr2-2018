package by.tc.task01.service.validation;

import java.util.Map;

import by.tc.task01.entity.criteria.Criteria;

public class Validator {

	public static <E> boolean criteriaValidator(Criteria<E> criteria) {

		// you may add your own code here
		// is empty and is null
		boolean validationResault = false;
		Map<E, Object> searchMap = criteria.getCriteria();
		
		for (Map.Entry<E, Object> entry : searchMap.entrySet()){
			if((entry.getValue() != null) && (!(entry.getValue().toString().equals("")))){
				 validationResault = true;
			}
		}
		return validationResault;
	}

	// you may add your own code here

}

// you may add your own new classes