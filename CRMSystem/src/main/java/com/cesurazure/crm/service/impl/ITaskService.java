package com.cesurazure.crm.service.impl;

import com.cesurazure.crm.common.ICommonService;
import com.cesurazure.crm.model.Task;
import javax.servlet.http.HttpServletRequest;

public interface ITaskService extends ICommonService<Task> {
    public Task updateStatus(HttpServletRequest request);
}
