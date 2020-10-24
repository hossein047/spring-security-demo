package com.example.finalproject.mapper;

import com.example.finalproject.model.Person;
import com.example.finalproject.model.PersonRequestDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface PersonMapper {
    PersonMapper mapp = Mappers.getMapper(PersonMapper.class);

    Person requestToEntity(PersonRequestDto dto);
}
