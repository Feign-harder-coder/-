package org.skh.springboot.controller;

import com.csvreader.CsvReader;
import org.skh.springboot.bean.PredictSocket;
import org.skh.springboot.bean.Predict_New;
import org.skh.springboot.bean.SingleSocket;
import org.skh.springboot.mapper.NowadaySocketMapper;
import org.skh.springboot.mapper.PredictSocketMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Controller
public class SingleQueryController {

    @Autowired
    public PredictSocketMapper pm ;
@Autowired
public NowadaySocketMapper nm ;

    @RequestMapping("SingleQueryController")
    @ResponseBody
    public ModelAndView single(@RequestParam("id") String id){
        String sid = id.replaceAll("'", "");
        CsvReader reader = null;
        List<SingleSocket> dataList = new ArrayList<SingleSocket>();
        ArrayList<SingleSocket> datalist1 = new ArrayList<>();

        ModelAndView modelAndView = new ModelAndView("page7_02");
        try {

            reader = new CsvReader("/csvfile/"+sid+".csv", ',', Charset.forName("UTF-8"));

            // 读取表头
            reader.readHeaders();
            String[] headArray = reader.getHeaders();//获取标题
            System.out.println(headArray[0] + headArray[1] + headArray[2]);
            String ids = null;
            String name = null ;

           int flag = 1 ;
            // 逐条读取记录，直至读完
            while (reader.readRecord()) {
                if(flag == 1){
                    id = reader.get(1) ;
                    name = reader.get(2) ;
                    flag ++ ;

                }
                dataList.add(new SingleSocket(reader.get(0).replaceAll("/","-"),Double.parseDouble(reader.get(6)),Double.parseDouble(reader.get(7)),Double.parseDouble(reader.get(4)),Double.parseDouble(reader.get(5)))) ;

            }
            for (SingleSocket s:dataList){
                datalist1.add(s) ;
            }

            PredictSocket byId = pm.getById(sid);
            Predict_New byId01 = pm.getById01(sid);
            ArrayList<String> predict = new ArrayList<>();
            ArrayList<String> predict1 = new ArrayList<>();
            int getscore = nm.getscore(sid);
            if(getscore > 98){
                predict.add(String.valueOf(Double.parseDouble(byId.getFor1())));
                predict.add(String.valueOf(Double.parseDouble(byId.getFor2())));
                predict.add(String.valueOf(Double.parseDouble(byId.getFor3())));
                predict1.add(String.valueOf(Double.parseDouble(byId01.getFor1())));
                predict1.add(String.valueOf(Double.parseDouble(byId01.getFor2())));
                predict1.add(String.valueOf(Double.parseDouble(byId01.getFor3())));
            }else if(getscore <98 && getscore>90){
                predict.add(String.valueOf(Double.parseDouble(byId.getFor1())*0.990));
                predict.add(String.valueOf(Double.parseDouble(byId.getFor2())*0.995));
                predict.add(String.valueOf(Double.parseDouble(byId.getFor3())));
                predict1.add(String.valueOf(Double.parseDouble(byId01.getFor1())*0.990));
                predict1.add(String.valueOf(Double.parseDouble(byId01.getFor2())*0.995));
                predict1.add(String.valueOf(Double.parseDouble(byId01.getFor3())));
            }else if(getscore>85 && getscore<=90){
                predict.add(String.valueOf(Double.parseDouble(byId.getFor1())*0.98));
                predict.add(String.valueOf(Double.parseDouble(byId.getFor2())*0.987));
                predict.add(String.valueOf(Double.parseDouble(byId.getFor3())*0.992));
                predict1.add(String.valueOf(Double.parseDouble(byId01.getFor1())*0.98));
                predict1.add(String.valueOf(Double.parseDouble(byId01.getFor2())*0.987));
                predict1.add(String.valueOf(Double.parseDouble(byId01.getFor3())*0.992));
            }else{
                predict.add(String.valueOf(Double.parseDouble(byId.getFor1())*0.97));
                predict.add(String.valueOf(Double.parseDouble(byId.getFor2())*0.98));
                predict.add(String.valueOf(Double.parseDouble(byId.getFor3())*0.985));
                predict1.add(String.valueOf(Double.parseDouble(byId01.getFor1())*0.97));
                predict1.add(String.valueOf(Double.parseDouble(byId01.getFor2())*0.98));
                predict1.add(String.valueOf(Double.parseDouble(byId01.getFor3())*0.985));
            }

            dataList.sort(new Comparator<SingleSocket>() {
                @Override
                public int compare(SingleSocket o1, SingleSocket o2) {
                    return o1.getDate().compareTo(o2.getDate()) ;
                }
            });
            modelAndView.addObject("k1_chart",dataList) ;
            modelAndView.addObject("num",sid);
            modelAndView.addObject("name",name);
            modelAndView.addObject("up","99999");
            modelAndView.addObject("uptime","2019-9-17") ;
            modelAndView.addObject("future1",predict) ;
            modelAndView.addObject("future2",predict1) ;


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (null != reader) {
                reader.close();
            }
        }

       return modelAndView ;
    }
}
