package kz.zhanbolat.movie_theather.service;

import kz.zhanbolat.movie_theather.dao.AbstractDao;
import kz.zhanbolat.movie_theather.entity.User;

import java.util.List;

/**
 *  Manages registered users
 *  Main functions: save, remove, getById, getUserByEmail, getAll.
 */
public class UserService {
    private AbstractDao dao;

    public UserService(AbstractDao dao) {
        this.dao = dao;
    }

    public void save(User user) {

    }

    public void remove(User user) {

    }

    public User getById(int id) {
        return null;
    }

    public User getUserByEmail(String email) {
        return null;
    }

    public List<User> getAll() {
        return null;
    }

}
