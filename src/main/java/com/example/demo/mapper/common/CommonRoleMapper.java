package com.example.demo.mapper.common;

import com.example.demo.config.CamelCaseMap;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommonRoleMapper {


    List<CamelCaseMap> findRoleList();
}
