package com.cesurazure.crm.controller;

import com.cesurazure.crm.model.AssignLead;
import com.cesurazure.crm.model.Business;
import com.cesurazure.crm.model.CRMUser;
import com.cesurazure.crm.model.Lead;
import com.cesurazure.crm.model.Task;
import com.cesurazure.crm.service.impl.IAssignCRMService;
import com.cesurazure.crm.service.impl.IAssignLeadService;
import com.cesurazure.crm.service.impl.IBusinessService;
import com.cesurazure.crm.service.impl.ICRMUserService;
import com.cesurazure.crm.service.impl.ILeadService;
import com.cesurazure.crm.service.impl.ITaskService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class EntryController {

    @Autowired
    IBusinessService businessService;

    @Autowired
    ICRMUserService crmuserService;

    @Autowired
    ILeadService leadService;

    @Autowired
    IAssignCRMService assignCRMService;

    @Autowired
    IAssignLeadService assignLeadService;

    @Autowired
    ITaskService taskService;

    @RequestMapping("/")
    public ModelAndView hello() {
        return new ModelAndView("entry/sign_in");
    }

    @RequestMapping(value = "/signup")
    public ModelAndView hello1() {
        return new ModelAndView("entry/sign_up");
    }

    @RequestMapping(value = "/home")
    public ModelAndView hello2() {
        return new ModelAndView("home/home_page");
    }

    //    ASSIGN
    @RequestMapping(value = "/assignreport")
    public ModelAndView hello3() {
        List<AssignLead> assignLeads = assignLeadService.getAll();

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("assignLeads", assignLeads);
        return new ModelAndView("assign/assign_report", "map", map);
    }

    @RequestMapping(value = "/assignCRM")
    public ModelAndView hello4() {
        List<CRMUser> crmlist = crmuserService.getAll();
        List<Business> businesslist = businessService.getAll();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("crmlist", crmlist);
        map.put("businesslist", businesslist);

        return new ModelAndView("assign/assign_crm", "map", map);
    }

    //    BUSINESS
    @RequestMapping(value = "/businesscreate")
    public ModelAndView hello6() {
        return new ModelAndView("business/business_create");
    }

    @RequestMapping(value = "/businessreport")
    public ModelAndView hello7() {
        List<Business> businessList = businessService.getAll();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("businessList", businessList);
        return new ModelAndView("business/business_report", "map", map);
    }

    //    CRM
    @RequestMapping(value = "/crmusercreate")
    public ModelAndView hello8() {
        return new ModelAndView("crm/crm_user_create");
    }

    @RequestMapping(value = "/crmreport")
    public ModelAndView hello9() {
        List<CRMUser> crmlist = crmuserService.getAll();

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("crmlist", crmlist);
        return new ModelAndView("crm/crm_report", "map", map);
    }

    //    LEAD
    @RequestMapping(value = "/leadcreate")
    public ModelAndView hello10() {
        return new ModelAndView("lead/lead_create");
    }

    @RequestMapping(value = "/leadreport")
    public ModelAndView hello11() {
        List<Lead> leadlist = leadService.getAll();

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("leadlist", leadlist);
        return new ModelAndView("lead/lead_report", "map", map);
    }

//    PACKAGE
    @RequestMapping(value = "/combinedpackcreate")
    public ModelAndView hello12() {
        return new ModelAndView("pack/combined_pack_create");
    }

    @RequestMapping(value = "/packagereport")
    public ModelAndView hello13() {
        return new ModelAndView("pack/package_msg_report");
    }

    @RequestMapping(value = "/minpackcreate")
    public ModelAndView hello19() {
        return new ModelAndView("pack/minute_pack_create");
    }

    @RequestMapping(value = "/smspackcreate")
    public ModelAndView hello20() {
        return new ModelAndView("pack/sms_pack_create");
    }

    @RequestMapping(value = "/gprspackcreate")
    public ModelAndView hello21() {
        return new ModelAndView("pack/gprs_pack_create");
    }

//    Activities
    @RequestMapping(value = "/activitiesview")
    public ModelAndView hello14() {
        Map<String, Object> map = new HashMap<String, Object>();
        List<Task> task = taskService.getAll();
        map.put("task", task);
        return new ModelAndView("activities/activities_view", "map", map);
    }

    @RequestMapping(value = "/taskcreate")
    public ModelAndView hello15() {
        List<CRMUser> crmlist = crmuserService.getAll();
        List<Lead> leadlist = leadService.getAll();

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("crmlist", crmlist);
        map.put("leadlist", leadlist);
        return new ModelAndView("activities/task_create", "map", map);
    }

//    CORPORATE HOUSE
    @RequestMapping(value = "/chousereport")
    public ModelAndView hello17() {
        return new ModelAndView("corporate_house/corporate_house_report");
    }

    @RequestMapping(value = "/chousecreate")
    public ModelAndView hello18() {
        return new ModelAndView("corporate_house/corporate_house_create");
    }

//    CONTACT
    @RequestMapping(value = "/contactcreate")
    public ModelAndView hello16() {
        return new ModelAndView("contact/contact_create");
    }

    @RequestMapping(value = "/header")
    public ModelAndView hello111() {
        return new ModelAndView("common/header");
    }

    @RequestMapping(value = "/testheader")
    public ModelAndView hello22() {
        return new ModelAndView("contact/contact_create");
    }

    @RequestMapping(value = "/verification-page")
    public ModelAndView hello23() {
        return new ModelAndView("service/customer_service/customer_mobile_verification_page");
    }

}
