package org.openmrs.module.insuranceclaims.api.dao;

import org.openmrs.module.insuranceclaims.api.model.InsuranceClaimIntervention;
import java.util.List;

public interface InsuranceClaimInterventionDao extends BaseOpenmrsCriteriaDao<InsuranceClaimIntervention> {
    List<InsuranceClaimIntervention> getByClaimId(Integer claimId);
}
