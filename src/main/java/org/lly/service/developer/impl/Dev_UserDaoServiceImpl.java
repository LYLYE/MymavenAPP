package org.lly.service.developer.impl;

import org.lly.dao.developer.Dev_UserDao;
import org.lly.pojo.AppCategory;
import org.lly.pojo.DateDictionary;
import org.lly.pojo.Dev_User;
import org.lly.service.developer.Dev_UserDaoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class Dev_UserDaoServiceImpl implements Dev_UserDaoService {

    @Resource
    private Dev_UserDao dev_userDao;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public Dev_User findByDevName(String devCode) {
        return dev_userDao.findByDevName(devCode);
    }

    @Override
    public List<AppCategory> categoryLevel1List() {
        return dev_userDao.categoryLevel1List();
    }

    @Override
    public List<DateDictionary> flatFormList() {
        return dev_userDao.flatFormList();
    }

    @Override
    public List<DateDictionary> statusList() {
        return dev_userDao.statusList();
    }

    @Override
    public List<AppCategory> categoryLevel2List() {
        return dev_userDao.categoryLevel2List();
    }


}
