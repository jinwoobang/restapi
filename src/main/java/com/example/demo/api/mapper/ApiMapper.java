package com.example.demo.api.mapper;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.dto.TestApiDto;




@Mapper
public interface ApiMapper {

	/**
	 * @Description 목록 조회
	 */
	public TestApiDto retrieveOne(TestApiDto dto);
	
	/**
	 * @Description 목록 조회
	 */
	public List<TestApiDto> retrieveList();
	
	/**
	 * @Description 등록
	 */
	//public int insert(TestApiDto dto);
	//public int insert(List<TestApiDto> dto);
	public int insert(@Param("list")List<TestApiDto> dto, @Param("map")Map<String,Object> map);
	
	/**
	 * @Description 수정
	 */
	public int update(TestApiDto dto);
	
	/**
	 * @Description 수정
	 */
	public int delete(TestApiDto dto);
}
