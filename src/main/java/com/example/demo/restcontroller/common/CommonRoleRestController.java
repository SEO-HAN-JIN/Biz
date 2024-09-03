package com.example.demo.restcontroller.common;

import com.example.demo.config.CamelCaseMap;
import com.example.demo.dto.common.RoleDto;
import com.example.demo.service.common.CommonRoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/common")
@RequiredArgsConstructor
public class CommonRoleRestController {

    private final CommonRoleService commonRoleService;

    @GetMapping("/role/list")
    public List<CamelCaseMap> findRoleList() {
        return commonRoleService.findRoleList();
    }
}
