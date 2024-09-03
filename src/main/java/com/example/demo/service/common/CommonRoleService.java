package com.example.demo.service.common;

import com.example.demo.config.CamelCaseMap;
import com.example.demo.mapper.common.CommonRoleMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommonRoleService {

    private final CommonRoleMapper commonRoleMapper;

    public List<CamelCaseMap> findRoleList() {
        return commonRoleMapper.findRoleList();
    }
}
