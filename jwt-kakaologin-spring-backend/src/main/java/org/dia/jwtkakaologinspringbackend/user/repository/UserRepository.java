package org.dia.jwtkakaologinspringbackend.user.repository;

import org.dia.jwtkakaologinspringbackend.user.entity.WebtyUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<WebtyUser, Long> {
    WebtyUser findByUserId(Long userId);
}
