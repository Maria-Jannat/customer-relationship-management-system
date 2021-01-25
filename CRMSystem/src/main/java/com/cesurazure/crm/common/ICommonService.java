package com.cesurazure.crm.common;

import java.util.List;
import javax.servlet.http.HttpServletRequest;

public interface ICommonService<T> {

    public T save(HttpServletRequest request);

    public T update(HttpServletRequest request);

    public T delete(int id);

    public List<T> getAll();

    public T getById(int id);
}
