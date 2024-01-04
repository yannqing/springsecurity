package com.yannqing;

import com.yannqing.dao.PermissionsDao;
import com.yannqing.dao.UserDao;
import com.yannqing.pojo.Permissions;
import com.yannqing.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SurpriseApplicationTests {

    @Autowired
    UserDao userDao;

    @Autowired
    PermissionsDao permissionsDao;

    @Test
    void testUserDao() {
        User tomas = userDao.getUserByUsername("tomas");
        System.out.println(tomas);
    }

    @Test
    void testPermissionsDao() {
        List<String> permissions = permissionsDao.queryPermissionsByUserId(2);
        System.out.println(permissions);
    }

}
