package com.syh.springbasic.service;

import org.springframework.http.ResponseEntity;

import com.syh.springbasic.dto.PostSample1RequestDto;

public interface SampleService {

    ResponseEntity<String> postSample1 (PostSample1RequestDto dto);
}
