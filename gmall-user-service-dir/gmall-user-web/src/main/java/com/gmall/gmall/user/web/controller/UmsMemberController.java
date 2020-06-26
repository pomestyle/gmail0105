package com.gmall.gmall.user.web.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.gamll.api.bean.UmsMember;
import com.gamll.api.service.UmsMemberService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

/**
 * @description:
 * @author: Administrator
 * @create: 2020-06-23 22:59
 **/
@RequestMapping("/api/umb")
@RestController
public class UmsMemberController {

    //dubbo 的service
    @Reference
    private UmsMemberService umsMemberService;

    @RequestMapping("/findAll")
    public List<UmsMember> all() {
        return umsMemberService.getUmsMemberList();
    }


    @RequestMapping("/findById")
    public UmsMember all(long id) {
        return umsMemberService.findUmsMemberById(id);
    }


}
