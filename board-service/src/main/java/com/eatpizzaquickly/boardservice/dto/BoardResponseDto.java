package com.eatpizzaquickly.boardservice.dto;

import com.eatpizzaquickly.boardservice.entity.Board;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class BoardResponseDto {
    private  String title;
    private  String content;
    private  String nickname;
    private LocalDateTime createdAt;
    private  LocalDateTime modifiedAt;

    public BoardResponseDto(String title, String content, String nickname, LocalDateTime createdAt, LocalDateTime modifiedAt) {
        this.title = title;
        this.content = content;
        this.nickname = nickname;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
    }
    public static BoardResponseDto from(Board board) {
        return new BoardResponseDto(
                board.getTitle(),
                board.getContent(),
                board.getNickname(),
                board.getCreatedAt(),
                board.getModifiedAt()
        );
    }
}
