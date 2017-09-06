package io.khasang.teamnote.dao.impl;

import io.khasang.teamnote.dao.ItemsDao;
import io.khasang.teamnote.entity.Items;

/**
 * @author d.grushetskiy
 */
public class ItemsDaoImpl extends BasicDaoImpl<Items> implements ItemsDao {
    public ItemsDaoImpl(Class<Items> entityClass) {
        super(entityClass);
    }
}
