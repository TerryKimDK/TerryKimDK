package com.cloudrip.domain;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



import lombok.Data;

@Data
@Entity
@Table (name = "board")
public class MemberVo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    
    @Column(unique = true)
    private String member_id;

    @Column(length = 30)
    private String member_name;

    @Column(length = 15)
    private String member_pw;
    
    @Column
    private Long member_nice;
    
    @Column
    private String zipcode;
    
    @Column
    private String address;
    
    @Column
    private String addr_detail;
    
    @Column
    private String phone_number;
    
    @Column(unique = true)
    private String nickname;
    
    @Column
    private String mail_receive;
    
    @OneToMany(mappedBy = "member", cascade = CascadeType.REMOVE)
    private List<BoardVo> boardList;
	
	
}
