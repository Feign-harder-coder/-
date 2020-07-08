package org.skh.springboot.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.skh.springboot.bean.DownSocket;
import org.skh.springboot.bean.UpdaySocket;

import java.util.List;
@Mapper
public interface UpDayMapper {
    public List<UpdaySocket> getall();
    public List<DownSocket> getDown() ;
    public List<UpdaySocket> getup();
    public List<DownSocket> getdown01() ;
}
