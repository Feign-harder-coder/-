package org.skh.springboot.controller;

import org.skh.springboot.bean.NowadaySocket;
import org.skh.springboot.mapper.NowadaySocketMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
public class NowadaySocketController {

    @Autowired
    public NowadaySocketMapper nm ;

    @RequestMapping("page6_02")
    public String demo(Map<String,Object> map){
        List<NowadaySocket> all = nm.getAll();
        map.put("single_list",all);
        return "page6_02" ;
    }
}
