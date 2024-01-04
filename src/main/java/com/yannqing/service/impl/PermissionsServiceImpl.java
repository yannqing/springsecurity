package com.yannqing.service.impl;

import com.yannqing.dao.PermissionsDao;
import com.yannqing.service.PermissionsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class PermissionsServiceImpl implements PermissionsService {

    @Autowired
    PermissionsDao permissionsDao;

    @Override
    public List<String> queryPermissionsByUserId(Integer userId) {
        return permissionsDao.queryPermissionsByUserId(userId);
    }
}
