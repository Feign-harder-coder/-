package org.skh.springboot.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.skh.springboot.bean.AreaRanking;
import org.skh.springboot.bean.MapArea;

import java.util.List;

@Mapper
public interface AreaRankingMapper {
    public List<AreaRanking> getall() ;
    public int getCount() ;
    public List<MapArea> getarea();
}
