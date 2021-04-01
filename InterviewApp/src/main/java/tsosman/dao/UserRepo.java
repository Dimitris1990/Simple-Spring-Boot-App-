package tsosman.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.repository.query.Param;
import tsosman.entities.User;

public interface UserRepo extends JpaRepository<User, Integer>{
    
    public List<User> findByCompany(@Param("company")String company);
    
}
