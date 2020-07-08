package org.skh.springboot.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.skh.springboot.bean.IndustryRanking;

import java.util.List;

@Mapper
public interface IndustryRankingMapper {
    public int getCount() ;
    public List<IndustryRanking> getAll() ;
    public List<IndustryRanking> getUp();
    public List<IndustryRanking> getDown() ;

}
