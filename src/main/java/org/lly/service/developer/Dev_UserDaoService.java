package org.lly.service.developer;

import org.lly.pojo.AppCategory;
import org.lly.pojo.DateDictionary;
import org.lly.pojo.Dev_User;

import java.util.List;

public interface Dev_UserDaoService {


    //    登录
    public Dev_User findByDevName(String devCode);

    //获取第一字段的集合
    List<AppCategory> categoryLevel1List();

    //    获取app所属平台
    List<DateDictionary> flatFormList();


    //    获取app状态
    List<DateDictionary> statusList();

    //获取第一字段的集合
    List<AppCategory> categoryLevel2List();
}
