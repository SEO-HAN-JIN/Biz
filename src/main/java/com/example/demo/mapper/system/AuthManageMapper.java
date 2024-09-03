package com.example.demo.mapper.system;

import com.example.demo.config.CamelCaseMap;
import com.example.demo.dto.system.AuthManageDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AuthManageMapper {
    List<AuthManageDto> findUserList();
    int updateUserList(AuthManageDto authManageDto);

    List<CamelCaseMap> findRoleList();
    int saveRole(AuthManageDto authManageDto);
    int updateRole(AuthManageDto authManageDto);
    int deleteRole(AuthManageDto authManageDto);

    List<CamelCaseMap> findResourceList();
    void saveResources(AuthManageDto authManageDto);
    int getResourceLastInsertId();

    int saveRoleResource(AuthManageDto authManageDto);
    int updateResources(AuthManageDto authManageDto);
    int deleteResources(AuthManageDto authManageDto);

}
