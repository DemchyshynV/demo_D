package qwwer1.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import qwwer1.demo.models.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
