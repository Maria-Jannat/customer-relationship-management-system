package com.cesurazure.crm.service;

import com.cesurazure.crm.dao.impl.IPackCombinedDAO;
import com.cesurazure.crm.model.PackCombined;
import com.cesurazure.crm.service.impl.IPackCombinedService;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "packCombinedService")
public class PackCombinedService implements IPackCombinedService {

    @Autowired
    IPackCombinedDAO packCombinedDAO;

    @Override
    public PackCombined save(HttpServletRequest request) {
        PackCombined packCombined = new PackCombined();
        packCombined.setPackCombinedId(request.getParameter("packCombinedId"));
        packCombined.setPackCombinedName(request.getParameter("packCombinedName"));
        packCombined.setPackCombinedSMSType(request.getParameter("packCombinedSMSType"));
        packCombined.setPackCombinedSMSCount(request.getParameter("packCombinedSMSCount"));
        packCombined.setPackCombinedMinType(request.getParameter("packCombinedMinType"));
        packCombined.setPackCombinedMinCount(request.getParameter("packCombinedMinCount"));
        packCombined.setPackCombinedGPRSType(request.getParameter("packCombinedGPRSType"));
        packCombined.setPackCombinedGPRSAmount(request.getParameter("packCombinedGPRSAmount"));
        packCombined.setPackCombinedDuration(request.getParameter("packCombinedDuration"));
        packCombined.setPackCombinedStatus(request.getParameter("packCombinedStatus"));
        packCombined.setPackCombinedPrice(request.getParameter("packCombinedPrice"));
        packCombined.setPackCombinedDescription(request.getParameter("packCombinedDescription"));

        System.out.println("*************" + packCombined.getPackCombinedName());
        System.out.println("*************" + packCombined.getPackCombinedStatus());

        packCombinedDAO.save(packCombined);
        return packCombined;
    }

    @Override
    public PackCombined update(HttpServletRequest request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PackCombined delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PackCombined> getAll() {
        return packCombinedDAO.getAll();
    }

    @Override
    public PackCombined getById(int id) {
        return packCombinedDAO.getById(id);
    }

}
