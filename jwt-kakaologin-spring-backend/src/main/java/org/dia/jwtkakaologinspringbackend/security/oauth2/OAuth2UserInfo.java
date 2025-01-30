package org.dia.jwtkakaologinspringbackend.security.oauth2;

public interface OAuth2UserInfo {
    String getProviderId();
    String getProvider();
}
