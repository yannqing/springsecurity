package com.yannqing.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PermissionsDao {

    @Select("select distinct yp.code from yan_permissions yp inner join yan_role_permissions yrp on yp.id = yrp.pid inner join yan_role_user yru on yru.rid = yrp.rid where yru.uid = #{userId}")
    List<String> queryPermissionsByUserId(Integer userId);
}
