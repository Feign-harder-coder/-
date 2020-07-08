package org.skh.springboot.controller;

import org.skh.springboot.bean.DownSocket;
import org.skh.springboot.bean.UpdaySocket;
import org.skh.springboot.mapper.UpDayMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class UpAndDownController {

    @Autowired
    public UpDayMapper um ;

    @RequestMapping("list5_01")
    public String gallery(Map<String,Object> map){
        List<UpdaySocket> getall = um.getall();
        List<DownSocket> down = um.getDown();
        List<UpdaySocket> getup = um.getup();
        List<DownSocket> down1 = um.getdown01();
        ArrayList<String> upnames = new ArrayList<>();
        ArrayList<Integer> upday = new ArrayList<>();
        ArrayList<String> downnames = new ArrayList<>();
        ArrayList<Integer> downday = new ArrayList<>();
        for (UpdaySocket u:getup){
            upnames.add(u.getName());
            upday.add(u.getUpday()) ;
        }
        for (DownSocket d:down1){
            downnames.add(d.getName());
            downday.add(d.getDownday()) ;
        }
        map.put("up_list",getall);
        map.put("down_list",down) ;

        map.put("max_name",upnames);
        map.put("max_days",upday);
        map.put("min_days",downday);
        map.put("min_name",downnames);

        return "list5_01" ;
    }
}
