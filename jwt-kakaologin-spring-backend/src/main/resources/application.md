```
spring:
  application:
    name: jwt-kakaologin-spring-backend

  # DATABASE
  h2:
    console:
      enabled: true
      path: /h2-console
  datasource:
    url: jdbc:h2:file:./local/local;AUTO_SERVER=TRUE
    driverClassName: org.h2.Driver
    username: sa
    password:

# JPA
  jpa:
    properties:
      hibernate:
        dialect: org.hibernate.dialect.H2Dialect
    hibernate:
      ddl-auto: update

  security:
    oauth2:
      client:
        registration:
          kakao:
            client-id: ${OAUTH_KAKAO_CLIENT_ID}
            client-secret: ${OAUTH_KAKAO_CLIENT_SECRET}
            scope: profile_nickname
            authorization-grant-type: authorization_code
            redirect-uri: ${OAUTH_KAKAO_REDIRECT_URI}
            client-name: Kakao
            client-authentication-method: client_secret_post

        provider:
          kakao:
            authorization-uri: https://kauth.kakao.com/oauth/authorize
            token-uri: https://kauth.kakao.com/oauth/token
            user-info-uri: https://kapi.kakao.com/v2/user/me
            user-name-attribute: id
            
jwt:
  secret: 
  redirect: http://localhost:3000/callback
  access-token:
    expiration-time: 3600000
  refresh-token:
    expiration-time: 604800000
```
