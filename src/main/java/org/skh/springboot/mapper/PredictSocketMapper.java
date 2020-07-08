package org.skh.springboot.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.skh.springboot.bean.PredictSocket;
import org.skh.springboot.bean.Predict_New;

@Mapper
public interface PredictSocketMapper {
    public PredictSocket getById(String id) ;
    public Predict_New getById01(String id) ;
}
