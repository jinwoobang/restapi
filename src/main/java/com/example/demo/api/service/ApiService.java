package com.example.demo.api.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.api.mapper.ApiMapper;
import com.example.demo.dto.TestApiDto;

@Service
public class ApiService {

	@Autowired
	private TestApiDto testApiDto;
	
	@Autowired
	private ApiMapper testApiMapper;
	
	public TestApiDto retrieve(TestApiDto dto) {
		//testApiDto.setOut_seq(setSeq);
		//String seq = testApiDto.getOut_seq();
		//System.out.println("seq :" + seq);
		TestApiDto dtoOne = testApiMapper.retrieveOne(dto);

		return dtoOne;
	}
	
	public List<TestApiDto> retrieveList() {
		//testApiDto.setOut_seq("20250827-O00005");
		List<TestApiDto> dto = testApiMapper.retrieveList();

		return dto;
	}
	
	/*
	public int insert(TestApiDto dto) {
		testApiMapper.insert(dto);
		return 0;	
	}
	*/
	
	/*
	
	public int insert(List<TestApiDto> dtoList) {
	    for (TestApiDto dto : dtoList) {
	        testApiMapper.insert(dto); 
	    }
	    return dtoList.size(); 
	}
	*/
	
	/*
	public int insert(List<TestApiDto> dtoList) {
	    return testApiMapper.insert(dtoList); // Batch Mapper 호출
	}
	*/
	
	public int insert(List<TestApiDto> dtoList, Map<String,Object> map) {
	    return testApiMapper.insert(dtoList, map); // Batch Mapper 호출
	}
	
	
	public int update(TestApiDto dto) {
		testApiMapper.update(dto);
		return 0;		
	}
	
	public int delete(TestApiDto dto) {
		testApiMapper.delete(dto);
		return 0;		
	}
}
