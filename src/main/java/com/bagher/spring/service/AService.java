package com.bagher.spring.service;

import com.bagher.spring.model.A;
import com.bagher.spring.repository.ARepository;
import com.bagher.spring.service.dto.ADTO;
import com.bagher.spring.service.mapper.AMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AService {
    @Autowired
    ARepository aRepository;
    @Autowired
    AMapper aMapper;

    public List<ADTO> findAll(){
        List<A> all = aRepository.findAll();
        return  aMapper.toDTO(all);
    }
}
