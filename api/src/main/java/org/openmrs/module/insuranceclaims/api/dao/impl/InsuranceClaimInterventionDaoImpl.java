package org.openmrs.module.insuranceclaims.api.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.openmrs.module.insuranceclaims.api.dao.BaseOpenmrsDataDao;
import org.openmrs.module.insuranceclaims.api.dao.InsuranceClaimInterventionDao;
import org.openmrs.module.insuranceclaims.api.model.InsuranceClaimIntervention;

import java.util.List;

public class InsuranceClaimInterventionDaoImpl extends BaseOpenmrsDataDao<InsuranceClaimIntervention>
        implements InsuranceClaimInterventionDao {

    public InsuranceClaimInterventionDaoImpl() {
        super(InsuranceClaimIntervention.class);
    }

    @Override
    public List<InsuranceClaimIntervention> getByClaimId(Integer claimId) {
        Criteria criteria = createCriteria();
        criteria.createAlias("claim", "c");
        criteria.add(Restrictions.eq("c.id", claimId));
        return findAllByCriteria(criteria, false);
    }
}
