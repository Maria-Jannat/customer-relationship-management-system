/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cesurazure.crm.service;

import com.cesurazure.crm.dao.impl.IPackMinuteDAO;
import com.cesurazure.crm.model.PackMinute;
import com.cesurazure.crm.service.impl.IPackMinuteService;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "packMinuteService")
public class PackMinuteService implements IPackMinuteService {

    @Autowired
    IPackMinuteDAO packMinuteDAO;

    @Override
    public PackMinute save(HttpServletRequest request) {
        PackMinute packMin = new PackMinute();
        packMin.setMinPackId(request.getParameter("minPackId"));
        packMin.setMinPackName(request.getParameter("minPackName"));
        packMin.setMinPackType(request.getParameter("minPackType"));
        packMin.setMinPackCount(request.getParameter("minPackCount"));
        packMin.setMinPackDuration(request.getParameter("minPackDuration"));
        packMin.setMinPackStatus(request.getParameter("minPackStatus"));
        packMin.setMinPackPrice(request.getParameter("minPackPrice"));
        packMin.setMinPackDescription(request.getParameter("minPackDescription"));
        System.out.println("*************" + packMin.getMinPackCount());
        System.out.println("*************" + packMin.getMinPackName());

        packMinuteDAO.save(packMin);
        return packMin;
    }

    @Override
    public PackMinute update(HttpServletRequest request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PackMinute delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PackMinute> getAll() {
        return packMinuteDAO.getAll();
    }

    @Override
    public PackMinute getById(int id) {
        return packMinuteDAO.getById(id);
    }

}
