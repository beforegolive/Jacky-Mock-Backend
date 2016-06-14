package com.thoughtworks.mock.tmb.entity;

import com.thoughtworks.mock.tmb.enums.CommonStatus;

import java.util.Date;

public class BaseEntity {
    private Long id;
    private Date timeCreated;
    private CommonStatus commonStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(Date timeCreated) {
        this.timeCreated = timeCreated;
    }

    public CommonStatus getCommonStatus() {
        return commonStatus;
    }

    public void setCommonStatus(CommonStatus commonStatus) {
        this.commonStatus = commonStatus;
    }
}
