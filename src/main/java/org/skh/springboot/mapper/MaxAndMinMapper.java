package org.skh.springboot.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.skh.springboot.bean.MaxAndMin;

import javax.validation.constraints.Max;
import java.util.List;

@Mapper
public interface MaxAndMinMapper {
    public List<MaxAndMin> getAll();
    public List<MaxAndMin> getmax();
    public List<MaxAndMin> getmin() ;
}
