package com.afabao.travel.service.impl;

import com.afabao.travel.dao.TestDao;
import com.afabao.travel.service.TestService;
import com.afabao.travel.test.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Wells on 2019/6/25 0025.
 */
@Service
@Transactional
public class TestServiceImpl implements TestService {

    @Autowired
    private TestDao dao;

    @Override
    public List<Test> list() {
        return dao.list();
    }
}
