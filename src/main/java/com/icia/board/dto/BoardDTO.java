package com.icia.board.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BoardDTO {
    private Long id;
    private Long memberId;
    private String boardWriter;
    private String boardTitle;
    private String boardContents;
    private String createdAt;
    private int boardHits = 0;
    private int fileAttached;
}
