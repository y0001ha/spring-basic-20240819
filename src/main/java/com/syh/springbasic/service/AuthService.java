package com.syh.springbasic.service;

import com.syh.springbasic.dto.PostUserRequestDto;

public interface AuthService {
    String signUp(PostUserRequestDto dto);
}
