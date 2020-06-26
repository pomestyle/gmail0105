package com.gamll.api.service;



import com.gamll.api.bean.UmsMember;

import java.util.List;

/**
 * @description:
 * @author: Administrator
 * @create: 2020-06-25 18:38
 **/
public interface UmsMemberService {
    /**
     * 查询所有用户
     * @return
     */
    List<UmsMember> getUmsMemberList();

    public UmsMember findUmsMemberById(long id);

    public int addUmsMember(UmsMember umb);

    public int updateUmsMember(UmsMember umb);

 }