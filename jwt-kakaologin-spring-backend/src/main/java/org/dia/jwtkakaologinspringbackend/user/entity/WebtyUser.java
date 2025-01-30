package org.dia.jwtkakaologinspringbackend.user.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@Getter
public class WebtyUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // ID 자동 생성 설정
    @Column
    private Long userId;
    
    @Column
    private String nickname;
    
    @Column
    private String profileImg;
    
    @OneToOne(mappedBy = "user")
    private SocialProvider socialProvider;
}
