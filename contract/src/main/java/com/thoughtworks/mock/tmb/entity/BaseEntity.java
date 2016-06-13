package com.thoughtworks.mock.tmb.entity;

import com.thoughtworks.mock.tmb.enums.CommonStatus;

import java.util.Date;

public class BaseEntity {
    private Long id;
    private Date createTime;
    private CommonStatus commonstatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public CommonStatus getCommonstatus() {
        return commonstatus;
    }

    public void setCommonstatus(CommonStatus commonstatus) {
        this.commonstatus = commonstatus;
    }
}
