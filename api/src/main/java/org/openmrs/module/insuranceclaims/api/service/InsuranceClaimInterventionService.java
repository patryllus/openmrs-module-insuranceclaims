package org.openmrs.module.insuranceclaims.api.service;

import org.openmrs.module.insuranceclaims.api.model.InsuranceClaimIntervention;
import java.util.List;

public interface InsuranceClaimInterventionService extends OpenmrsDataService<InsuranceClaimIntervention> {
    List<InsuranceClaimIntervention> getByClaimId(Integer claimId);
}
