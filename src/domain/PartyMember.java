package domain;

import java.util.Date;

/**
 * 党员信息表
 * @version 1.0
 */
public class PartyMember {
    private Integer id;
    private String name;
    private String dept;
    private String mobile;
    private String idCard;
    private String category;
    private Date joinTime;
    private Date formalTime;
    private Integer partyBranch_id;
    private Integer state;
    /**创建时间*/
    private Date createTime;
    /**更新时间*/
    private Date updateTime;
    /**操作人*/
    private String operator;
    private String bak;
    
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getDept() {
        return dept;
    }
    
    public void setDept(String dept) {
        this.dept = dept;
    }
    
    public String getMobile() {
        return mobile;
    }
    
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    
    public String getIdCard() {
        return idCard;
    }
    
    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }
    
    public String getCategory() {
        return category;
    }
    
    public void setCategory(String category) {
        this.category = category;
    }
    
    public Date getJoinTime() {
        return joinTime;
    }
    
    public void setJoinTime(Date joinTime) {
        this.joinTime = joinTime;
    }
    
    public Date getFormalTime() {
        return formalTime;
    }
    
    public void setFormalTime(Date formalTime) {
        this.formalTime = formalTime;
    }
    
    public Integer getPartyBranch_id() {
        return partyBranch_id;
    }
    
    public void setPartyBranch_id(Integer partyBranch_id) {
        this.partyBranch_id = partyBranch_id;
    }
    
    public Integer getState() {
        return state;
    }
    
    public void setState(Integer state) {
        this.state = state;
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
    
    public String getBak() {
        return bak;
    }
    
    public void setBak(String bak) {
        this.bak = bak;
    }
    
    @Override
    public String toString() {
        return "PartyMember{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", mobile='" + mobile + '\'' +
                ", idCard='" + idCard + '\'' +
                ", category='" + category + '\'' +
                ", joinTime=" + joinTime +
                ", formalTime=" + formalTime +
                ", partyBranch_id=" + partyBranch_id +
                ", state=" + state +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", operator='" + operator + '\'' +
                ", bak='" + bak + '\'' +
                '}';
    }
}
