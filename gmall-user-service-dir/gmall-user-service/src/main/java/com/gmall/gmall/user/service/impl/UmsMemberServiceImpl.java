package com.gmall.gmall.user.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.gamll.api.bean.UmsMember;
import com.gamll.api.service.UmsMemberService;
import com.gmall.gmall.user.service.dao.UmsMemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @description:
 * @author: Administrator
 * @create: 2020-06-25 18:38
 **/
@Service //这里@Service 注解需要使用dubbo 的注解
public class UmsMemberServiceImpl implements UmsMemberService {


    @Autowired
    private UmsMemberMapper umsMemberMapper;

    @Override
    public List<UmsMember> getUmsMemberList() {

        return umsMemberMapper.selectAllUmsMebers();
    }

    @Override
    public UmsMember findUmsMemberById(long id) {

        return umsMemberMapper.selectByPrimaryKey(id);
    }

    @Override
    @Transactional(rollbackFor = {Exception.class,RuntimeException.class})
    public int addUmsMember(UmsMember umb) {
        return umsMemberMapper.insert(umb);
    }


    @Override
    @Transactional(rollbackFor = {Exception.class,RuntimeException.class})
    public int updateUmsMember(UmsMember umb) {

        return umsMemberMapper.updateByPrimaryKey(umb);
    }


}
