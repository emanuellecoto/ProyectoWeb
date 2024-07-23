package com.proyectoWeb.services.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.proyectoWeb.domain.Forum;
import com.proyectoWeb.dao.ForumDao;
import com.proyectoWeb.services.ForumService;
import org.springframework.stereotype.Service;

@Service
public class ForumServiceImpl 
     implements ForumService {

    @Autowired
    private ForumDao forumDao;

    @Override
    @Transactional(readOnly = true)
    public List<Forum> getForums(boolean visto) {
        var lista = forumDao.findAll();
        return lista;
    }

    @Override
    public Forum getForum(Forum forum) {
        return forumDao.findById(forum.getIdForum()).orElse(null);
    }

    @Override
    public void save(Forum forum) {
        forumDao.save(forum);
    }

    @Override
    public void delete(Forum forum) {
        forumDao.delete(forum);
    }



}
