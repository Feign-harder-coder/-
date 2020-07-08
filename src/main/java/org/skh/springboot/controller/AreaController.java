package org.skh.springboot.controller;

import org.skh.springboot.bean.AreaRanking;
import org.skh.springboot.bean.MapArea;
import org.skh.springboot.mapper.AreaRankingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AreaController {
    @Autowired
    AreaRankingMapper am ;
    @RequestMapping("list2_01")
    @ResponseBody
    public ModelAndView area(){
        ModelAndView modelAndView = new ModelAndView("list2_01.html");
        int count = am.getCount();
        List<AreaRanking> getall = am.getall();
        List<MapArea> getarea = am.getarea();
        ArrayList<String> name = new ArrayList<>();
        ArrayList<Integer> up = new ArrayList<>();
        ArrayList<Integer> down = new ArrayList<>();
        /**
         * name_cchart
         * up_cchart
         * down_cchart
         */
        for (AreaRanking a:getall){
            name.add(a.getIndustry());
            up.add(a.getUp());
            down.add(a.getDown());
        }
        modelAndView.addObject("map_cchart",getarea);
        modelAndView.addObject("area_list",getall);
        modelAndView.addObject("name_cchart",name);
        modelAndView.addObject("up_cchart",up);
        modelAndView.addObject("down_cchart",down);
        return modelAndView ;
    }
}
