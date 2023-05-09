package com.testSpring2.testSpring2.mvc.repository;

import com.testSpring2.testSpring2.mvc.entity.Board;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    //전체 조회기능
     List<Board> findAll();

     //게시글 저장 기능
    boolean save(Board board);

    //게시글 삭제 기능
    boolean delete(int boardNo);

    //한개의 게시글만 조회하는 기능
    Board findOne(int boardNo);


}
