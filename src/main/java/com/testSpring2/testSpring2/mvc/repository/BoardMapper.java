package com.testSpring2.testSpring2.mvc.repository;

import com.testSpring2.testSpring2.mvc.entity.Board;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    //전체 조회기능
     List<Board> findAll();


}
