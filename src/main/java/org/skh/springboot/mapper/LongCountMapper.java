package org.skh.springboot.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.skh.springboot.bean.LongCount;
import org.skh.springboot.bean.LowMaxAndMin;

import java.util.List;

@Mapper
public interface LongCountMapper {
    public List<LongCount> getAll() ;
    public List<LowMaxAndMin> getEch() ;
}
