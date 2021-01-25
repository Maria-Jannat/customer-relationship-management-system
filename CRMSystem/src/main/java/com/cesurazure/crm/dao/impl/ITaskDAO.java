package com.cesurazure.crm.dao.impl;

import com.cesurazure.crm.common.ICommonDAO;
import com.cesurazure.crm.model.Task;

public interface ITaskDAO extends ICommonDAO<Task> {

    public Task updateStatus(Task t);

}
