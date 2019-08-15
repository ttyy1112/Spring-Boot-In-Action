package com.tm.sbia.feature.dao;

import com.tm.sbia.feature.domain.DemoUser;
import com.tm.sbia.feature.domain.DemoUserExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface DemoUserMapper {
    long countByExample(DemoUserExample example);

    int deleteByExample(DemoUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DemoUser record);

    int insertSelective(DemoUser record);

    List<DemoUser> selectByExample(DemoUserExample example);

    DemoUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DemoUser record, @Param("example") DemoUserExample example);

    int updateByExample(@Param("record") DemoUser record, @Param("example") DemoUserExample example);

    int updateByPrimaryKeySelective(DemoUser record);

    int updateByPrimaryKey(DemoUser record);
}