package org.skh.springboot.controller;

import com.csvreader.CsvReader;
import com.google.gson.Gson;
import org.skh.springboot.bean.SingleSocket;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

@Controller
public class JsonTest {
    @RequestMapping("list02")
    public String demo02(){
        return "list2_01" ;
    }


    @RequestMapping("json")
    @ResponseBody
    public List<SingleSocket> single(){
        CsvReader reader = null;
        List<SingleSocket> dataList = new ArrayList<SingleSocket>();
        ModelAndView modelAndView = new ModelAndView("page7_02");
        try {

            reader = new CsvReader("F:\\skh\\demo\\test\\000001.csv", ',', Charset.forName("GBK"));

            // 读取表头
            reader.readHeaders();
            String[] headArray = reader.getHeaders();//获取标题
            System.out.println(headArray[0] + headArray[1] + headArray[2]);

            // 逐条读取记录，直至读完
            while (reader.readRecord()) {
                dataList.add(new SingleSocket(reader.get(0),Double.parseDouble(reader.get(6)),Double.parseDouble(reader.get(7)),Double.parseDouble(reader.get(4)),Double.parseDouble(reader.get(5)))) ;

            }


            Gson gson = new Gson();
            String json = gson.toJson(dataList);


            System.out.println(json);
            modelAndView.addObject("k1_chart",json) ;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (null != reader) {
                reader.close();
            }
        }

        return dataList ;
    }
}
