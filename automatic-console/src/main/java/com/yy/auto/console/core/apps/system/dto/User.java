package com.yy.auto.console.core.apps.system.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * user
 */
public class User implements Serializable {

    private static final long serialVersionUID = -8559092329555414018L;

    private Integer userId;

    /**
     *登陆名称
     */
    private String loginName;

    /**
     *用户姓名
     */
    private String userName;

    /**
     *用户密码
     */
    private String password;

    /**
     *登陆手机号
     */
    private String phone;

    /**
     *登陆邮箱
     */
    private String email;

    /**
     *用户头像
     */
    private String headerPhoto;

    /**
     *用户状态（0正常，1停用，9删除）
     */
    private Short status;

    /**
     *备注
     */
    private String remark;

    /**
     *密码过期时间
     */
    private Date passwordEndTime;

    /**
     *创建时间
     */
    private Date createTime;

    /**
     *更新时间
     */
    private Date updateTime;

    public User(String username) {
        this.userName = username;
        this.loginName = userName;
    }

    /**
     *用户ID
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     *用户ID
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     *登陆名称
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     *登陆名称
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    /**
     *用户姓名
     */
    public String getUserName() {
        return userName;
    }

    /**
     *用户姓名
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     *用户密码
     */
    public String getPassword() {
        return password;
    }

    /**
     *用户密码
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     *登陆手机号
     */
    public String getPhone() {
        return phone;
    }

    /**
     *登陆手机号
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     *登陆邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     *登陆邮箱
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     *用户头像
     */
    public String getHeaderPhoto() {
        return headerPhoto;
    }

    /**
     *用户头像
     */
    public void setHeaderPhoto(String headerPhoto) {
        this.headerPhoto = headerPhoto == null ? null : headerPhoto.trim();
    }

    /**
     *用户状态（0正常，1停用，9删除）
     */
    public Short getStatus() {
        return status;
    }

    /**
     *用户状态（0正常，1停用，9删除）
     */
    public void setStatus(Short status) {
        this.status = status;
    }

    /**
     *备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     *备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     *密码过期时间
     */
    public Date getPasswordEndTime() {
        return passwordEndTime;
    }

    /**
     *密码过期时间
     */
    public void setPasswordEndTime(Date passwordEndTime) {
        this.passwordEndTime = passwordEndTime;
    }

    /**
     *创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     *创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     *更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     *更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
