package org.dia.jwtkakaologinspringbackend.user.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@Getter
@Setter
@Table(name = "social_provider")
public class SocialProvider {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // ID 자동 생성 설정
    @Column
    private Long socialId;
    
    @Column
    private String provider;
    
    @Column
    private String providerId;
    
    @OneToOne
    @JoinColumn(name = "webtyUser_Id")
    private WebtyUser user;
}
