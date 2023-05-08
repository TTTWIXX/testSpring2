package com.testSpring2.testSpring2.mvc.service;

import com.testSpring2.testSpring2.mvc.entity.Board;
import com.testSpring2.testSpring2.mvc.repository.BoardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardMapper boardMapper;

    public List<Board> findAll(){

        return boardMapper.findAll();
    }



}
