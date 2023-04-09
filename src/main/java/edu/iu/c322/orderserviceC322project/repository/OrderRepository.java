package edu.iu.c322.orderserviceC322project.repository;

import edu.iu.c322.orderserviceC322project.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// we still end up using the user be the user databases should store the info of their or
@Repository
public interface OrderRepository extends JpaRepository<User,Integer> {
}
