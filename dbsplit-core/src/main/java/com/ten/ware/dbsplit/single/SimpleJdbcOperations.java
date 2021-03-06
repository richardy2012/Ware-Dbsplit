package com.ten.ware.dbsplit.single;

import java.util.List;

/**
 * 封装SpringJDBC，对外提供更高级的API
 */
public interface SimpleJdbcOperations {
    public <T> void insert(T bean);

    public <T> void update(T bean);

    public <T> void delete(long id, Class<T> clazz);

    public <T> T get(long id, final Class<T> clazz);

    public <T> T get(String name, Object value, final Class<T> clazz);

    public <T> List<T> search(final T bean);

    public <T> List<T> search(String sql, Object[] params, final Class<T> clazz);
}
