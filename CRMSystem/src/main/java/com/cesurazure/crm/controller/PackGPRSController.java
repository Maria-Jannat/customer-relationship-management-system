
package com.cesurazure.crm.controller;

import com.cesurazure.crm.controller.impl.IPackMinuteController;
import com.cesurazure.crm.model.PackMinute;
import com.cesurazure.crm.service.impl.IPackGPRSService;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class PackGPRSController implements IPackMinuteController{

    @Autowired
    IPackGPRSService packGPRSService;
    
    @Override
    @RequestMapping(value = "/gprsSave")
    public ModelAndView save(HttpServletRequest request) {
        System.out.println("*********** Hitted ***********");
        packGPRSService.save(request);
        return new ModelAndView("redirect:/gprspackcreate");
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
    public List<PackMinute> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
