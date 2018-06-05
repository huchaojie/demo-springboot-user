package com.yc.dao;

import org.apache.ibatis.session.SqlSessionFactory;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
/**
 * Sql工具类
 * @param <T>
 */
public interface BaseDao<T> {

    @Resource(name="sqlSessionFactory")
    void setSqlSessionFactiry(SqlSessionFactory sqlSessionFactory);

    /**
     * 查询
     * @param t
     * @param sqlId
     * @return
     */

    public List<T> findAll(T t, String sqlId);

    /**
     * 查询
     * @param t
     * @param map
     * @param sqlId
     * @return
     */

    public List<T> findAll(T t, Map map, String sqlId);

    /**
     * 添加
     * @param t
     * @param sqlId
     * @return
     */

    public Integer add(T t, String sqlId);

    /**
     * 添加
     * @param t
     * @param map
     * @param sqlId
     * @return
     */

    public Integer add(T t, Map map, String sqlId);

    /**
     * 添加
     * @param t
     * @param list
     * @param sqlId
     * @return
     */

    public Integer addMany(T t, List list, String sqlId);

    /**
     * 删除
     * @param t
     * @param sqlId
     * @return
     */

    public Integer delete(T t, String sqlId);

    /**
     * 删除
     * @param t
     * @param map
     * @param sqlId
     * @return
     */

    public Integer delete(T t, Map map, String sqlId);

    /**
     * 删除
     * @param t
     * @param list
     * @param sqlId
     * @return
     */

    public Integer deleteMany(T t, List list, String sqlId);

    /**
     * 修改
     * @param t
     * @param sqlId
     * @return
     *
     */

    public Integer update(T t, String sqlId);

    /**
     * 修改
     * @param t
     * @param map
     * @param sqlId
     * @return
     */

    public Integer update(T t, Map map, String sqlId);

    /**
     * 修改
     * @param t
     * @param list
     * @param sqlId
     * @return
     */

    public Integer updateMany(T t, List list, String sqlId);

    /**
     * 查询
     * @param t
     * @param sqlId
     * @return
     */
    //聚合

    public double findFunc(T t, String sqlId);

    /**
     * 查询
     * @param t
     * @param map
     * @param sqlId
     * @return
     */

    public double findFunc(T t, Map map, String sqlId);
}
