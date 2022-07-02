package com.octo.ru.cardvisa.service;

import com.octo.ru.cardvisa.model.VisaCard;
import com.octo.ru.cardvisa.repository.VisaCardRepository;
import com.octo.ru.system.response.BaseResponse;
import com.octo.ru.system.service.BaseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class VisaCardService implements BaseService {
    @Autowired
    VisaCardRepository repository;

    public BaseResponse getAll(){
        return SPECIAL(repository.findAll(), "ok", 200, true);
    }

    public BaseResponse getById(Long id){
        Optional<VisaCard> optional = repository.findById(id);
        if (optional.isPresent()){
            SPECIAL(optional.get(), "ok", 200, true);
        }
        log.error("requested object not found");
        return DONT_EXIST(new VisaCard());
    }

    public BaseResponse save(VisaCard card){
        repository.save(card);
        return SUCCESS_ADDED(card);
    }

    public BaseResponse deleteById(Long id){
        Optional<VisaCard> optional = repository.findById(id);
        if (optional.isPresent()){
            repository.deleteById(id);
            SPECIAL(optional.get(), "ok", 200, true);
        }
        log.error("requested object not found");
        return DONT_EXIST(new VisaCard());
    }
}
