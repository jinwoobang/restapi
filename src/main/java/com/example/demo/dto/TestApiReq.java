package com.example.demo.dto;

import java.util.List;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TestApiReq {
	
	
	 @NotBlank(message = "spmtYn은 필수입니다")
	 private String spmtYn;	 
	 private String remark;
	 
    
	 @Valid
	 private List<TestApiDto> entity;
}
