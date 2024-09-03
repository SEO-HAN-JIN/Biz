package com.example.demo.dto.system;

import com.example.demo.dto.BaseDto;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class AuthManageDto extends BaseDto {

    // 사용자 관리
    private int userId;
    private String role;
    private String agency;

    // 권한 관리
    private int roleId;
    private String roleName;
    private String roleDesc;

    // 리소스 관리
    private int resourcesId;
    private String resourcesOrderNum;
    private String resourcesName;
}
