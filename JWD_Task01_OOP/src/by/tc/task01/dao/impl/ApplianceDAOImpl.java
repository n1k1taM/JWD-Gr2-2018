package by.tc.task01.dao.impl;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.builder.ApplianceBuilder;
import by.tc.task01.dao.builder.BuilderFactory;
import by.tc.task01.dao.comparator.ApplianceParameterComparator;
import by.tc.task01.dao.util.SourceApplianceReader;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

public class ApplianceDAOImpl implements ApplianceDAO {

	@Override
	public <E> Appliance find(Criteria<E> criteria) throws IOException {
		
		Appliance appliance = null;
		String applianceType = criteria.getApplianceType();
		Map<E, Object> criteriaMap = criteria.getCriteria();
		List<String> fileLines = null;
				
		SourceApplianceReader applianceReader = SourceApplianceReader.getInstance();
		fileLines = applianceReader.getAllFileLines();
		
		for (String line : fileLines) {
			int criteriaCounter = 0;
			for (Map.Entry<E, Object> entry : criteriaMap.entrySet()) {
				boolean resultMatching = ApplianceParameterComparator.match(line, criteria.getApplianceType(),
						entry.getKey().toString(), entry.getValue().toString());
				if (resultMatching) {
					criteriaCounter++;
				}
			}
			if (criteriaMap.size() == criteriaCounter) {
				BuilderFactory factory = BuilderFactory.getInstance();
				ApplianceBuilder applianceBuilder = factory.getBuilder(applianceType);
				appliance = applianceBuilder.build(null, line);
				break;
			}
		}

		return appliance;
	}
}

// you may add your own new classes
