package com.cesurazure.crm.common;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

public interface ICommonController<T> {

    public ModelAndView save(HttpServletRequest request);

    public ModelAndView edit(int id);

    public ModelAndView update(HttpServletRequest request);

    public ModelAndView delete(int id);

    public List<T> getAll();
}
