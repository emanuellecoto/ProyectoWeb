
package com.proyectoWeb.dao;

import com.proyectoWeb.domain.Forum;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ForumDao 
extends JpaRepository<Forum,Long>{
    
}
