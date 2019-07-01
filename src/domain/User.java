package domain;

import java.util.Date;

/**
 * 系统用户
 * @version 1.0
 */
public class User {
    /**主键*/
    private Integer id;
    /**用户名*/
    private String username;
    /**密码*/
    private String password;
    /**支部id*/
    private Integer branchID;
    /**创建时间*/
    private Date createTime;
    /**更新时间*/
    private Date updateTime;
    /**操作人*/
    private String operator;
    /**角色*/
    private String role;
    
   
    
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public Integer getBranchID() {
        return branchID;
    }
    
    public void setBranchID(Integer branchID) {
        this.branchID = branchID;
    }
    
    public Date getCreateTime() {
        return createTime;
    }
    
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    
    public Date getUpdateTime() {
        return updateTime;
    }
    
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    
    public String getOperator() {
        return operator;
    }
    
    public void setOperator(String operator) {
        this.operator = operator;
    }
    
    public String getRole() {
        return role;
    }
    
    public void setRole(String role) {
        this.role = role;
    }
    
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", branchID=" + branchID +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", operator='" + operator + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
