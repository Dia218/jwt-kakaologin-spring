package org.dia.jwtkakaologinspringbackend.user.repository;

import org.dia.jwtkakaologinspringbackend.user.entity.SocialProvider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SocialProviderRepository extends JpaRepository<SocialProvider, Long> {
    SocialProvider findByProviderId(String providerId);
}
