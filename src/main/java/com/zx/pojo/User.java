package com.zx.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
  private String id;//主键
  private String loginAct;//登录账号
  private String name;//用户的真实name
  private String loginPwd;//登录密码
  private String email;
  private String expireTime;//失效时间
  private String lockState;//账号锁定状态 0 1
  private String deptno;//部门编号
  private String allowIps;//允许访问的ip地址
  private String createTime;//账号创建时间
  private String createBy ;//创建者
  private String editTime;//修改时间
  private String editBy;//修改人

}
