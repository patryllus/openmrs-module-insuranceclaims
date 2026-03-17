package org.openmrs.module.insuranceclaims.api.service.impl;

import org.openmrs.module.insuranceclaims.api.dao.InsuranceClaimInterventionDao;
import org.openmrs.module.insuranceclaims.api.model.InsuranceClaimIntervention;
import org.openmrs.module.insuranceclaims.api.service.InsuranceClaimInterventionService;

import java.util.List;

public class InsuranceClaimInterventionServiceImpl extends BaseOpenmrsDataService<InsuranceClaimIntervention>
        implements InsuranceClaimInterventionService {

    private InsuranceClaimInterventionDao dao;

    public void setDao(InsuranceClaimInterventionDao dao) {
        this.dao = dao;
    }

    @Override
    public List<InsuranceClaimIntervention> getByClaimId(Integer claimId) {
        return dao.getByClaimId(claimId);
    }
}
