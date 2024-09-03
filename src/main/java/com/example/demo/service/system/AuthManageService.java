package com.example.demo.service.system;

import com.example.demo.config.CamelCaseMap;
import com.example.demo.dto.system.AuthManageDto;
import com.example.demo.mapper.system.AuthManageMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class AuthManageService {

    private final AuthManageMapper authManageMapper;

    public List<AuthManageDto> findUserList() {
        return authManageMapper.findUserList();
    }

    public int saveUserList(List<AuthManageDto> authManageDtoList) {
        int result = 0;
        if (!CollectionUtils.isEmpty(authManageDtoList)) {
            for (AuthManageDto authManageDto : authManageDtoList) {
                result += authManageMapper.updateUserList(authManageDto);
            }
        }

        return result;
    }

    public List<CamelCaseMap> findRoleList() {
        return authManageMapper.findRoleList();
    }

    public int saveRoleList(List<AuthManageDto> authManageDtoList) {
        int result = 0;
        if (!CollectionUtils.isEmpty(authManageDtoList)) {
            for (AuthManageDto authManageDto : authManageDtoList) {
                switch (authManageDto.getRowStatus()) {
                    case C -> result += authManageMapper.saveRole(authManageDto);
                    case U -> result += authManageMapper.updateRole(authManageDto);
                    case D -> result += authManageMapper.deleteRole(authManageDto);
                }

            }
        }

        return result;
    }

    public List<CamelCaseMap> findResourceList() {
        return authManageMapper.findResourceList();
    }

    public int saveResourceList(List<AuthManageDto> authManageDtoList) {
        int result = 0;
        if (!CollectionUtils.isEmpty(authManageDtoList)) {
            for (AuthManageDto authManageDto : authManageDtoList) {
                switch (authManageDto.getRowStatus()) {
                    case C -> result += saveResource(authManageDto);
                    case U -> result += authManageMapper.updateResources(authManageDto);
                    case D -> result += authManageMapper.deleteResources(authManageDto);
                }

            }
        }

        return result;
    }

    private int saveResource(AuthManageDto authManageDto) {
        int result = 0;
        authManageMapper.saveResources(authManageDto);
        int resourcesId = authManageMapper.getResourceLastInsertId();
        authManageDto.setResourcesId(resourcesId);
        result += authManageMapper.saveRoleResource(authManageDto);
        return result;
    }
}
