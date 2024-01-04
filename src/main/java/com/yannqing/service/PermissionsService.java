package com.yannqing.service;

import java.util.List;

public interface PermissionsService {
    List<String> queryPermissionsByUserId(Integer userId);
}
