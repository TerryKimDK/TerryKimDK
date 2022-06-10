package com.cloudrip.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cloudrip.domain.ReviewVo;

public interface ReviewRepository extends JpaRepository<ReviewVo, Integer> {

}
