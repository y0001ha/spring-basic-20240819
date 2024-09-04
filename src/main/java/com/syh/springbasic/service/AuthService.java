package com.syh.springbasic.service;

import com.syh.springbasic.dto.PostUserRequestDto;
import com.syh.springbasic.dto.SignInRequestDto;

public interface AuthService {
    String signUp(PostUserRequestDto dto);
    String signIn(SignInRequestDto dto);
}
