package com.cesurazure.crm.dao.impl;

import com.cesurazure.crm.common.ICommonDAO;
import com.cesurazure.crm.model.AssignCRM;

public interface IAssignCRMDAO extends ICommonDAO<AssignCRM> {

    public AssignCRM getByCRMId(String crmId);

}
