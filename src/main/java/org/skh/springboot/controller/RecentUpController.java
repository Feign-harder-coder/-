package org.skh.springboot.controller;

import org.skh.springboot.bean.MaxAndMin;
import org.skh.springboot.bean.UpdaySocket;
import org.skh.springboot.mapper.MaxAndMinMapper;
import org.skh.springboot.mapper.UpDayMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

/**
 * 尽量使用Map传递参数
 */
@Controller
public class RecentUpController {
    @Autowired
    public MaxAndMinMapper mm ;
    @RequestMapping("list4")
    public String list4(Map<String,Object> map){

        List<MaxAndMin> all = mm.getmax();

        map.put("uplist",all) ;
        List<MaxAndMin> getmin = mm.getmin();
        map.put("downlist", getmin) ;
        return "list4" ;
    }
}
