package com.thoughtworks.tmb.common.model;

import com.thoughtworks.mock.tmb.enums.CommonStatus;

import javax.persistence.*;

@MappedSuperclass
public abstract class BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "time_created", nullable = false, updatable = false)
    private Long timeCreated;

    @Enumerated(EnumType.STRING)
    @Column(name = "common_status", nullable = true, length = 24)
    private CommonStatus commonStatus;
}
