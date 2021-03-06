package com.ctid.intelsmsapp.database.impl;

import com.ctid.intelsmsapp.database.SmsModelDao;
import com.ctid.intelsmsapp.entity.Model;

import java.util.List;

/**
 * 模板数据数据库操作实现类
 * Created by jiangyanjun on 2017/10/16.
 */

public class SmsModelDaoImpl implements SmsModelDao {

    @Override
    public void save(Model model) {
        model.save();
    }

    @Override
    public List<Model> findAll() {
        return Model.listAll(Model.class);
    }

    @Override
    public void delete(Model model) {
        model.delete();
    }


    @Override
    public void deleteAll() {
        Model.deleteAll(Model.class);
    }
}
