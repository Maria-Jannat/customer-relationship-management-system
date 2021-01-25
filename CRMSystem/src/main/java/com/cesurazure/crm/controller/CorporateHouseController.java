package com.cesurazure.crm.controller;

import com.cesurazure.crm.controller.impl.ICorporateHouseController;
import com.cesurazure.crm.model.CorporateHouse;
import com.cesurazure.crm.service.impl.ICorporateHouseService;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class CorporateHouseController implements ICorporateHouseController {

    @Autowired
    ICorporateHouseService corporateHouseService;

    @Override
    @RequestMapping(value = "/chousesave")
    public ModelAndView save(HttpServletRequest request) {
        System.out.println("*********** Hitted ***********");

        corporateHouseService.save(request);
        return new ModelAndView("redirect:/chousecreate");
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
    public List<CorporateHouse> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
