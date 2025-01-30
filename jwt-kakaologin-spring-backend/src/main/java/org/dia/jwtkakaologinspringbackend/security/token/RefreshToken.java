package org.dia.jwtkakaologinspringbackend.security.token;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@Getter
@Table(name = "refresh_tokens")
public class RefreshToken {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // ID 자동 생성 설정
    @Column
    private Long refreshTokenId;
    
    @Column
    private Long userId;
    
    @Column
    private String token;
}