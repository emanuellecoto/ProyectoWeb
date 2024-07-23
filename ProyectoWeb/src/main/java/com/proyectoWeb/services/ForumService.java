package com.proyectoWeb.services;

import com.proyectoWeb.domain.Forum;
import java.util.List;

public interface ForumService {

    public List<Forum> getForums(boolean visto);

    public Forum getForum(Forum forum);

    public void save(Forum forum);

    public void delete(Forum forum);
}
