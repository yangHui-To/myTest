package com.springboot.mapper;

import com.springboot.pojo.Notice;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

@Mapper
public interface NoticeMapper {

    @Select("select * from notice")
    List<Notice> findAll();

    Long count();

    List<Notice> findByPage(@Param("page")Integer page,@Param("rows")Integer rows);
}
