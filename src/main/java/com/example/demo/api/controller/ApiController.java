package com.example.demo.api.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.api.service.ApiService;
import com.example.demo.dto.TestApiDto;
import com.example.demo.dto.TestApiReq;

import jakarta.annotation.Resource;
import jakarta.validation.Valid;

@RestController
public class ApiController {

	@Resource(name = "apiService")
	private ApiService apiService;
		
	@GetMapping("/retrieve")
	public Map<String,Object> retrieve(TestApiDto dto) {
		//
		TestApiDto retrieve = apiService.retrieve(dto);
		Map<String,Object> ret = new HashMap<String,Object>();
		ret.put("result", retrieve);
		return ret;
	}
	
	@GetMapping("/retrieveList")
	public Map<String,Object> retrieveList() {
		List<TestApiDto> retrieveList = apiService.retrieveList();
		Map<String,Object> ret = new HashMap<String,Object>();
		ret.put("result", retrieveList);
		return ret;
	}
	
	/* 한가지만
	@PostMapping("/insert")
	public void insert(TestApiDto dto) {
		apiService.insert(dto);		
	}
	*/
	
	/*
	@PostMapping("/insert")
	public void insert(@RequestBody @Valid List<TestApiDto> request, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
	        throw new IllegalArgumentException(bindingResult.getAllErrors().get(0).getDefaultMessage());
	    }
	    apiService.insert(request);
	}
	*/

    /*
	@PostMapping("/insert")
	public void insert(@RequestBody @Valid TestApiReq request, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
	        throw new IllegalArgumentException(bindingResult.getAllErrors().get(0).getDefaultMessage());
	    }

		Map<String,Object> map = new HashMap<String,Object>();
		map.put("spmtYn", request.getSpmtYn());
		map.put("remark", request.getRemark());
	    apiService.insert(request.getEntity(), map);
	}
	*/

    @PostMapping("/insert")
    public void insert(@RequestBody @Valid TestApiReq request, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw new IllegalArgumentException(bindingResult.getAllErrors().get(0).getDefaultMessage());
        }

        Map<String,Object> map = new HashMap<String,Object>();
        //map.put("spmtYn", request.getSpmtYn());
        map.put("remark", request.getRemark());
        apiService.insert(request.getEntity(), map);
    }
	
	
	@PutMapping("/update")
	public void update(@Valid TestApiDto dto) {
		apiService.update(dto);		
	}
	
	@DeleteMapping("/delete")
	public void delete(@Valid TestApiDto dto) {
		apiService.delete(dto);		
	}
}
