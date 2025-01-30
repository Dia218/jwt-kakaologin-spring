package org.dia.jwtkakaologinspringbackend.security.oauth2;

import java.util.Map;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class KakaoUserInfo implements OAuth2UserInfo {
    
    private Map<String, Object> attributes;

    @Override
    public String getProviderId() {
        return attributes.get("id").toString();
    }
    
    @Override
    public String getProvider() {
        return "kakao";
    }
}