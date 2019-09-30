package kz.zhanbolat.movie_theather.dao;

import kz.zhanbolat.movie_theather.entity.Entity;

public abstract class AbstractDao<K extends Entity, E> {
    public abstract void findAll();
    public abstract void create(K k);
    public abstract void read(E e);
    public abstract void update(K k);
    public abstract void delete(E e);
}
