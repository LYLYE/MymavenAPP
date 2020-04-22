package org.lly.controller.developer;

import org.lly.pojo.AppCategory;
import org.lly.pojo.DateDictionary;
import org.lly.pojo.Dev_User;
import org.lly.service.developer.Dev_UserDaoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/dev")
public class DeveloperController {

    @Resource
    private Dev_UserDaoService dev_userDaoService;

//    从index页面跳转到用户登录界面
    @RequestMapping("/showlogin")
    public String showlogin(){
       return "devlogin";
    }

    @RequestMapping("/login")
    public String Login(ModelMap map, String devCode, String devPassword){

        Dev_User dev_user=dev_userDaoService.findByDevName(devCode);

        if (!dev_user.getDevPassword().equals(devPassword)){
            return "devlogin";
        }else{
            map.addAttribute("devUserSession",dev_user);
            return "/dev/main";

        }

    }

    @RequestMapping("/logout")
    public String logout(HttpSession session){
        session.removeAttribute("devUserSession");
        session.invalidate();
        return "devlogin";
    }

    @RequestMapping("/list")
    public String list(ModelMap map){
        List<AppCategory> categoryLevel1List=dev_userDaoService.categoryLevel1List();
        List<DateDictionary> statusList=dev_userDaoService.statusList();
        List<DateDictionary> flatFormList=dev_userDaoService.flatFormList();
        map.addAttribute("categoryLevel1List",categoryLevel1List);
        List<AppCategory> categoryLeve21List=dev_userDaoService.categoryLevel2List();
        map.addAttribute("statusList",statusList);
        map.addAttribute("flatFormList",flatFormList);
        map.addAttribute("categoryLeve21List",categoryLeve21List);
        return "/dev/appinfolist";
    }


}
