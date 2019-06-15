package com.scce.service.impl;

import com.scce.dao.StuDao;
import com.scce.pojo.Stu;
import com.scce.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: IdeaProjects
 * @description:
 * @author: Lxy
 * @create: 2019-06-15 10:13
 **/
@Service
public class StuServiceImpl implements StuService {

    @Autowired
    private StuDao stuDao;

    @Override
    public List<Stu> getStu() {
        List<Stu> stuList = stuDao.getStu11();
        return stuList;
    }
}
