package com.cloudrip.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cloudrip.domain.MemberVo;

public interface MemberRepository extends JpaRepository<MemberVo, Integer> {

}
