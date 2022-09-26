package com.quiz.javaquizapi.facade.impl;

import com.quiz.javaquizapi.annotation.Facade;
import com.quiz.javaquizapi.dto.UserDto;
import com.quiz.javaquizapi.facade.Mapper;
import com.quiz.javaquizapi.facade.UserFacade;
import lombok.RequiredArgsConstructor;

@Facade
@RequiredArgsConstructor
public class QuizUserFacade implements UserFacade {

    private final Mapper mapper;

    @Override
    public void authorize(UserDto dto) {

    }
}
