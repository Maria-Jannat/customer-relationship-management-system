package com.cesurazure.crm.controller;

import com.cesurazure.crm.controller.impl.ICRMUserController;
import com.cesurazure.crm.dao.impl.ICRMUserDAO;
import com.cesurazure.crm.model.CRMUser;
import com.cesurazure.crm.service.impl.ICRMUserService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class CRMUserController implements ICRMUserController {

    @Autowired
    ICRMUserService crmuserService;

    @Autowired
    ICRMUserDAO icrmuserDAO;
    
    @Override
    @RequestMapping(value = "/crmSave")
    public ModelAndView save(HttpServletRequest request) {

        System.out.println("*********** Hitted ***********");
        CRMUser cu = crmuserService.save(request);
        Map<String, Object> map = new HashMap<>();
        if (cu != null) {
            map.put("status", "Data Saved");
            return new ModelAndView("crm/crm_user_create", "map", map);
        } else {
            map.put("status", "Data NOT Saved");
            return new ModelAndView("crm/crm_user_create", "map", map);
        }
    }

    @Override
    public ModelAndView edit(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ModelAndView update(HttpServletRequest request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ModelAndView delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<CRMUser> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
