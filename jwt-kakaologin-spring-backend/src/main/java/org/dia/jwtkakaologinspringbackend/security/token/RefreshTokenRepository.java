package org.dia.jwtkakaologinspringbackend.security.token;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import jakarta.transaction.Transactional;

@Repository
public interface RefreshTokenRepository extends JpaRepository<RefreshToken,Long> {
    @Query("SELECT u FROM RefreshToken u WHERE u.userId = :userId")
    RefreshToken findByUserId(Long userId);
    
    @Transactional
    @Modifying
    @Query("DELETE FROM RefreshToken u WHERE u.userId = :userId")
    void deleteByUserId(Long userId);
}