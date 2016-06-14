package com.thoughtworks.tmb.common.dao;

import com.exmertec.yaz.BaseDao;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Component
public class BaseDaoWrapper<T> extends BaseDao<T> {
    protected BaseDaoWrapper(Class<T> prototype) {
        super(prototype);
    }

    @PersistenceContext
    public void injectEntityManager(EntityManager entityManager) {
        super.setEntityManager(entityManager);
    }
}
