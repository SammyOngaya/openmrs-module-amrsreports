package org.openmrs.module.amrsreports.reporting.data;

import org.openmrs.module.amrsreports.snapshot.ARVPatientSnapshot;
import org.openmrs.module.reporting.data.BaseDataDefinition;
import org.openmrs.module.reporting.data.person.definition.PersonDataDefinition;

/**
 * determines ARV patient snapshots for patients
 */
public class EligibilityForARTDataDefinition extends BaseDataDefinition implements PersonDataDefinition {

	@Override
	public Class<?> getDataType() {
		return ARVPatientSnapshot.class;
	}

}