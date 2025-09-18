package com.example.demo.dto;

import org.springframework.stereotype.Component;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component
public class TestApiDto {

	@NotBlank(message = "outSeq는 필수입니다")
	private String outSeq;
	
	private String pltId;
	
	private String srcNo;
	
	private String locaId;
	
	@NotBlank(message = "pickingCd는 필수입니다")
	@Size(max = 1, message = "pickingCd는 1자리여야 합니다")
	private String pickingCd;
	
	private String spmtTypeCd;
	
	private String spmtYn;
		
}
