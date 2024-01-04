# Spring Security

**环境：** 
springboot3.1.4
java17


---
## security配置

### SecurityUserDetailsServiceImpl
实现UserDetailsService
从数据库中查询用户，以及权限

### config

#### filterchain
+ 允许匿名
+ 关闭session
+ 表单登录
  + 登录成功处理
  + 登录路径/login
+ 退出logout
  + 退出成功处理
  + 退出路径/logout
+ 添加jwt过滤器
+ 关闭csrf
+ 关闭跨域

