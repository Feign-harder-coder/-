package org.skh.springboot.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.skh.springboot.bean.NowadaySocket;

import java.util.List;
@Mapper
public interface NowadaySocketMapper {
    public List<NowadaySocket> getAll() ;
    public int getscore(String id) ;
}
