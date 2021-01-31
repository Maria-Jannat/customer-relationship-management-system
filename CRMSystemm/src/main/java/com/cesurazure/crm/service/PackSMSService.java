package com.cesurazure.crm.service;

import com.cesurazure.crm.dao.impl.IPackSMSDAO;
import com.cesurazure.crm.model.PackSMS;
import com.cesurazure.crm.service.impl.IPackSMSService;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "packSMSService")
public class PackSMSService implements IPackSMSService {

    @Autowired
    IPackSMSDAO packSMSDAO;

    @Override
    public PackSMS save(HttpServletRequest request) {
        PackSMS packSMS = new PackSMS();
        packSMS.setSmsPackId(request.getParameter("smsPackId"));
        packSMS.setSmsPackName(request.getParameter("smsPackName"));
        packSMS.setSmsPackType(request.getParameter("smsPackType"));
        packSMS.setSmsPackCount(request.getParameter("smsPackCount"));
        packSMS.setSmsPackDuration(request.getParameter("smsPackDuration"));
        packSMS.setSmsPackStatus(request.getParameter("smsPackStatus"));
        packSMS.setSmsPackPrice(request.getParameter("smsPackPrice"));
        packSMS.setSmsPackDescription(request.getParameter("smsPackDescription"));

        System.out.println("*************" + packSMS.getSmsPackCount());
        System.out.println("*************" + packSMS.getSmsPackName());

        packSMSDAO.save(packSMS);
        return packSMS;
    }

    @Override
    public PackSMS update(HttpServletRequest request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PackSMS delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PackSMS> getAll() {
        return packSMSDAO.getAll();
    }

    @Override
    public PackSMS getById(int id) {
        return packSMSDAO.getById(id);
    }

}
