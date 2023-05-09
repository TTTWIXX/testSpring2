package com.testSpring2.testSpring2.mvc.dto;

import com.testSpring2.testSpring2.mvc.entity.Board;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Getter
@ToString
public class BoardListRequestDTO {

    private int boardNo;
    private String shortTitle;
    private String shortContent;
    private int viewCount;
    private String date;

    public BoardListRequestDTO(Board board) {
        this.boardNo = board.getBoardNo();
        this.shortTitle = shortTitle(board.getTitle());
        this.shortContent = shortContent(board.getContent());
        this.viewCount = board.getViewCount();
        this.date = makeDate(board.getRegDateTime());
    }

    private String makeDate(LocalDateTime regDateTime) {
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        return pattern.format(regDateTime);
    }

    private String shortContent(String content) {
        return getString(content, 20);
    }

    private String shortTitle(String title) {
        return getString(title, 8);
    }


    private static String getString(String title, int len) {
        return (title.length() > len) ? title.substring(0, len) + "..." : title;
    }


}
