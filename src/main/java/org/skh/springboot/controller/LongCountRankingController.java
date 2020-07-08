package org.skh.springboot.controller;

import org.skh.springboot.bean.LongCount;
import org.skh.springboot.bean.LowMaxAndMin;
import org.skh.springboot.mapper.LongCountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

@Controller
public class LongCountRankingController {

    @Autowired
    public LongCountMapper lm;

    @RequestMapping("list1_01")
    @ResponseBody
    public ModelAndView list(Map<String,Object> map){
        ModelAndView list1_01 = new ModelAndView("list1_01");
        List<LongCount> all = lm.getAll();
        List<LowMaxAndMin> ech = lm.getEch();
        ech.sort(new Comparator<LowMaxAndMin>() {
            @Override
            public int compare(LowMaxAndMin o1, LowMaxAndMin o2) {
                return (int) (Double.parseDouble(o2.getHalf_year()) - Double.parseDouble(o1.getHalf_year()) );
            }
        });
        list1_01.addObject("long_list",all);
        list1_01.addObject("long_chart",ech) ;
        System.out.println(ech);
        return list1_01 ;
    }
}
