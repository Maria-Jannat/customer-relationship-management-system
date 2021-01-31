package com.cesurazure.crm.service;

import com.cesurazure.crm.dao.impl.IPackGPRSDAO;
import com.cesurazure.crm.model.PackGPRS;
import com.cesurazure.crm.service.impl.IPackGPRSService;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "packGPRSService")
public class PackGPRSService implements IPackGPRSService {

    @Autowired
    IPackGPRSDAO packGPRSDAO;

    @Override
    public PackGPRS save(HttpServletRequest request) {
        PackGPRS packGPRS = new PackGPRS();
        packGPRS.setGprsPackId(request.getParameter("gprsPackId"));
        packGPRS.setGprsPackName(request.getParameter("gprsPackName"));
        packGPRS.setGprsPackType(request.getParameter("gprsPackType"));
        packGPRS.setGprsPackAmount(request.getParameter("gprsPackAmount"));
        packGPRS.setGprsPackDuration(request.getParameter("gprsPackDuration"));
        packGPRS.setGprsPackStatus(request.getParameter("gprsPackStatus"));
        packGPRS.setGprsPackPrice(request.getParameter("gprsPackPrice"));
        packGPRS.setGprsPackDescription(request.getParameter("gprsPackDescription"));

        System.out.println("*************" + packGPRS.getGprsPackName());
        System.out.println("*************" + packGPRS.getGprsPackPrice());

        packGPRSDAO.save(packGPRS);
        return packGPRS;
    }

    @Override
    public PackGPRS update(HttpServletRequest request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PackGPRS delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PackGPRS> getAll() {
        return packGPRSDAO.getAll();
    }

    @Override
    public PackGPRS getById(int id) {
        return packGPRSDAO.getById(id);
    }

}
