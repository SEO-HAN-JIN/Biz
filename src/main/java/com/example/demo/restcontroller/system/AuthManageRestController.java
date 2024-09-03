package com.example.demo.restcontroller.system;

import com.example.demo.config.CamelCaseMap;
import com.example.demo.dto.system.AuthManageDto;
import com.example.demo.service.system.AuthManageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/system/auth-manage")
@RequiredArgsConstructor
public class AuthManageRestController {

    private final AuthManageService authManageService;

    @GetMapping("/users")
    public List<AuthManageDto> findUserLIst() {
        return authManageService.findUserList();
    }

    @PostMapping("/users")
    public int saveUserList(@RequestBody List<AuthManageDto> authManageDtoList) {
        return authManageService.saveUserList(authManageDtoList);
    }

    @GetMapping("/role")
    public List<CamelCaseMap> findRoleList() {
        return authManageService.findRoleList();
    }

    @PostMapping("/role")
    public int saveRoleList(@RequestBody List<AuthManageDto> authManageDtoList) {
        return authManageService.saveRoleList(authManageDtoList);
    }

    @GetMapping("/resources")
    public List<CamelCaseMap> findResrouceList() {
        return authManageService.findResourceList();
    }

    @PostMapping("/resources")
    public int saveResourceList(@RequestBody List<AuthManageDto> authManageDtoList) {
        return authManageService.saveResourceList(authManageDtoList);
    }

}
