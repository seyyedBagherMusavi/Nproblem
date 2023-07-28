package com.bagher.spring.service.mapper;

import com.bagher.spring.model.A;
import com.bagher.spring.service.dto.ADTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface AMapper {
    A toEntity(ADTO adto);
    ADTO toDTO(A a);
    List<A> toEntity(List<ADTO> adto);
    List<ADTO> toDTO(List<A> a);
}
