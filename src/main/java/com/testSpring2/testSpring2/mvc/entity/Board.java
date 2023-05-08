package com.testSpring2.testSpring2.mvc.entity;

import lombok.*;

import java.time.LocalDateTime;
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Board {
    private int boardNo;
    private String title;
    private String content;
    private int viewCount;
    private LocalDateTime regDateTime;



}
