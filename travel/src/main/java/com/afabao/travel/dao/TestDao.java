package com.afabao.travel.dao;

import com.afabao.travel.test.Test;

import java.util.List;

/**
 * Created by Wells on 2019/6/25 0025.
 */

public interface TestDao {
    public List<Test> list();
    public Test get(Long id);
    public void add(Test test);
    public void delete(Long id);
    public void update(Test test);
}
