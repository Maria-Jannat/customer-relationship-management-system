package com.cesurazure.crm.service.impl;

import com.cesurazure.crm.common.ICommonService;
import com.cesurazure.crm.model.AssignCRM;

public interface IAssignCRMService extends ICommonService<AssignCRM> {
public AssignCRM getByCRMId(String crmId);
}
