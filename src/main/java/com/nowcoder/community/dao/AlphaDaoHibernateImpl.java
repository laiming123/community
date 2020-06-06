package com.nowcoder.community.dao;

import org.springframework.stereotype.Repository;

/**
 * @author laiming
 * @describ
 * @create 2020-06-11:12
 */
@Repository("alphaHibenate")
public class AlphaDaoHibernateImpl implements AlphaDao{
    @Override
    public String select() {
        return "Hibernate";
    }
}
