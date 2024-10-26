package com.eatpizzaquickly.boardservice.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@Entity
@NoArgsConstructor
public class Board {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private String userEmail;

    @Column(nullable = false)
    private String nickname;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    @Column
    private LocalDateTime modifiedAt;

    @Column(nullable = false)
    private Boolean isDelete = false;

    @Builder
    public Board(String title, String content, String userEmail, LocalDateTime createdAt) {
        this.title = title;
        this.content = content;
        this.userEmail = userEmail;
        this.createdAt = LocalDateTime.now();
    }

    public void update(String title,String content){
        this.title = title;
        this.content = content;
        this.modifiedAt = LocalDateTime.now();
    }
    public void delete(){
        this.isDelete = true;
    }
}
