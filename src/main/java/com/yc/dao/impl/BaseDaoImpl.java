package com.yc.dao.impl;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;
import com.yc.dao.BaseDao;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author hx
 * @date 2018/6/4
 * @param<T>
 */
@Repository
public class BaseDaoImpl<T> extends SqlSessionDaoSupport implements BaseDao<T>{

    private String mapperLocation="com.yc.mapper.";
    @Override
    @Resource(name="sqlSessionFactory")
    public void setSqlSessionFactiry(SqlSessionFactory sqlSessionFactory){
        super.setSqlSessionFactory(sqlSessionFactory);
    }
    private String getMapperId(T t,String sqlId){
        return mapperLocation+t.getClass().getSimpleName()+"Mapper."+sqlId;
    }

    @Override
    public List<T> findAll(T t, String sqlId) {
        return super.getSqlSession().selectList(getMapperId(t,sqlId),t);
    }
    @Override
    public List<T> findAll(T t, Map map, String sqlId) {
        return super.getSqlSession().selectList(getMapperId(t,sqlId),map);
    }
    @Override
    public Integer add(T t, String sqlId) {
        return super.getSqlSession().insert(getMapperId(t,sqlId),t);
    }
    @Override
    public Integer add(T t, Map map, String sqlId) {
        return super.getSqlSession().insert(getMapperId(t,sqlId),map);
    }
    @Override
    public Integer addMany(T t, List list, String sqlId) {
        return super.getSqlSession().insert(getMapperId(t,sqlId),list);
    }
    @Override
    public Integer delete(T t, String sqlId) {
        return super.getSqlSession().delete(getMapperId(t,sqlId),t);
    }
    @Override
    public Integer delete(T t, Map map, String sqlId) {
        return super.getSqlSession().delete(getMapperId(t,sqlId),map);
    }
    @Override
    public Integer deleteMany(T t, List list, String sqlId) {
        return super.getSqlSession().delete(getMapperId(t,sqlId),list);
    }
    @Override
    public Integer update(T t, String sqlId) {
        return super.getSqlSession().update(getMapperId(t,sqlId),t);

    }
    @Override
    public Integer update(T t, Map map, String sqlId) {
        return super.getSqlSession().update(getMapperId(t,sqlId),map);
    }
    @Override
    public Integer updateMany(T t, List list, String sqlId) {
        return super.getSqlSession().update(getMapperId(t,sqlId),list);
    }
    @Override
    public double findFunc(T t, String sqlId) {
        return super.getSqlSession().selectOne(this.getMapperId(t, sqlId));
    }
    @Override
    public double findFunc(T t, Map map, String sqlId) {
        return super.getSqlSession().selectOne(this.getMapperId(t, sqlId),map);
    }
}
