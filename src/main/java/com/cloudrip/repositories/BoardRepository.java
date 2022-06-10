package com.cloudrip.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cloudrip.domain.BoardVo;


public interface BoardRepository extends JpaRepository<BoardVo, Integer>{

}
