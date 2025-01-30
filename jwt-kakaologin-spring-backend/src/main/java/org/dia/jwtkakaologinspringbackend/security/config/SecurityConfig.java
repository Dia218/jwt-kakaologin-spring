package org.dia.jwtkakaologinspringbackend.security.config;

import org.dia.jwtkakaologinspringbackend.security.oauth2.OAuthLoginSuccessHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.annotation.web.configurers.HeadersConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

import lombok.RequiredArgsConstructor;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig {

	private final OAuthLoginSuccessHandler authLoginSuccessHandler;

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests(authorizeRequests ->
				authorizeRequests
					.requestMatchers("/h2-console/**")
					.permitAll()
					.requestMatchers("/logout/kakao", "/user-profile")
					.authenticated()
					.anyRequest().permitAll())
			.sessionManagement(
				sessionManagement -> sessionManagement.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
			.headers(
				headers ->
					headers.frameOptions(
						HeadersConfigurer.FrameOptionsConfig::sameOrigin
					)
			)
			.csrf(AbstractHttpConfigurer::disable)
			.oauth2Login(
				oauth2Login -> oauth2Login
					.successHandler(authLoginSuccessHandler));

		return http.build();
	}
}