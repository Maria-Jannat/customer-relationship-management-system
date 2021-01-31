package com.cesurazure.crm.service;

import com.cesurazure.crm.dao.impl.IServiceForBusinessDAO;
import com.cesurazure.crm.model.ServiceForBusiness;
import com.cesurazure.crm.service.impl.IServiceForBusinessService;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "serviceForBusinessService")
public class ServiceForBusinessService implements IServiceForBusinessService {

    @Autowired
    IServiceForBusinessDAO serviceForBusinessDAO;

    @Override
    public ServiceForBusiness save(HttpServletRequest request) {
        ServiceForBusiness serviceForBusiness = new ServiceForBusiness();
        serviceForBusiness.setServiceCode(request.getParameter("serviceCode"));
        serviceForBusiness.setServiceType(request.getParameter("serviceType"));
        serviceForBusiness.setServiceName(request.getParameter("serviceName"));
        serviceForBusiness.setServiceRate(request.getParameter("serviceRate"));
        serviceForBusiness.setServiceStatus(request.getParameter("serviceStatus"));
//        BUSINESS INFO
        serviceForBusiness.setBusinessName(request.getParameter("businessName"));
        serviceForBusiness.setType(request.getParameter("type"));
        serviceForBusiness.setTradedAs(request.getParameter("tradedAs"));
        serviceForBusiness.setIsin(request.getParameter("isin"));
        serviceForBusiness.setIndustry(request.getParameter("industry"));
        serviceForBusiness.setFounded(request.getParameter("founded"));
        serviceForBusiness.setFounder(request.getParameter("founder"));
        serviceForBusiness.setHeadquarter(request.getParameter("headquarter"));
        serviceForBusiness.setAreaServed(request.getParameter("areaServed"));
        serviceForBusiness.setKeyPeople(request.getParameter("keyPeople"));
        serviceForBusiness.setServices(request.getParameter("services"));
        serviceForBusiness.setRevenue(request.getParameter("revenue"));
        serviceForBusiness.setBusinessNumOfEmployees(request.getParameter("businessNumOfEmployees"));
        serviceForBusiness.setBusinessWebsite(request.getParameter("businessWebsite"));

        serviceForBusiness.setServiceDescription(request.getParameter("serviceDescription"));

        System.out.println("***********" + serviceForBusiness.getBusinessName());
        System.out.println("***********" + serviceForBusiness.getType());
        System.out.println("***********" + serviceForBusiness.getServiceStatus());

        serviceForBusinessDAO.save(serviceForBusiness);
        return serviceForBusiness;
    }

    @Override
    public ServiceForBusiness update(HttpServletRequest request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ServiceForBusiness delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ServiceForBusiness> getAll() {
        return serviceForBusinessDAO.getAll();
    }

    @Override
    public ServiceForBusiness getById(int id) {
        return serviceForBusinessDAO.getById(id);
    }

}
