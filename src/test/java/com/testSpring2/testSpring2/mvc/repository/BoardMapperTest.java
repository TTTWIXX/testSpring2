package com.testSpring2.testSpring2.mvc.repository;

import com.testSpring2.testSpring2.mvc.entity.Board;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class BoardMapperTest {


    @Autowired
    BoardMapper boardMapper;

    @Test
    @DisplayName("저장기능 시험")
    void save(){

        Board b = Board.builder().title("this is a testTitle").content("this is a testContent").build();

        boolean save = boardMapper.save(b);

        assertTrue(save);


    }


}