package org.skh.springboot.controller;

import org.skh.springboot.bean.IndustryRanking;
import org.skh.springboot.mapper.IndustryRankingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class IndustryRankingController {

    @Autowired
    public IndustryRankingMapper im ;


    @RequestMapping("list3_01")
    @ResponseBody
    public ModelAndView industry(Map<String,Object> map){

        ModelAndView modelAndView = new ModelAndView("list3_01");

        List<IndustryRanking> up = im.getUp();
        List<IndustryRanking> down = im.getDown();
        List<IndustryRanking> all = im.getAll();
        ArrayList<String> uname_inchart = new ArrayList<>();
        ArrayList<String> uzd_inchart = new ArrayList<>();
        for (IndustryRanking in:up){
            uname_inchart.add(in.getIndustry());
            uzd_inchart.add(in.getZhangfu());
        }
        modelAndView.addObject("uname_inchart",uname_inchart);
        modelAndView.addObject("uzd_inchart",uzd_inchart) ;
        ArrayList<String> dname_inchart = new ArrayList<>();
        ArrayList<String> dzd_inchart = new ArrayList<>();

        for (IndustryRanking in:down){
            dname_inchart.add(in.getIndustry());
            dzd_inchart.add(in.getZhangfu());
        }
        modelAndView.addObject("dname_inchart",dname_inchart);
        modelAndView.addObject("dzd_inchart",dzd_inchart) ;
        modelAndView.addObject("ind_list",all) ;
        return modelAndView ;
    }
}
