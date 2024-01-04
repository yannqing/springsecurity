package com.yannqing.service.impl;

import com.yannqing.dao.UserDao;
import com.yannqing.pojo.User;
import com.yannqing.service.PermissionsService;
import com.yannqing.service.UserService;
import com.yannqing.vo.SecurityUser;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class SecurityUserDetailsServiceImpl implements UserDetailsService {

    @Resource
    private UserDao userDao;
    @Autowired
    private PermissionsService permissionService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //获取到用户的全部信息
        User user = userDao.getUserByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("用户不存在");
        }
        //获取到用户的所有权限信息
        List<String> permissions = permissionService.queryPermissionsByUserId(user.getUserId());
        List<SimpleGrantedAuthority> authorities = permissions.stream().map(SimpleGrantedAuthority::new).toList();

        SecurityUser securityUser = new SecurityUser(user);
        securityUser.setSimpleGrantedAuthorities(authorities);
        return securityUser;
    }
}
