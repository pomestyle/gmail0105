package com.gmall.gmall.user.service.dao;


import com.gamll.api.bean.UmsMember;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UmsMemberMapper extends tk.mybatis.mapper.common.Mapper<UmsMember> {

    /**
     * 查询所有
     * @return
     */
    List<UmsMember> selectAllUmsMebers();
}