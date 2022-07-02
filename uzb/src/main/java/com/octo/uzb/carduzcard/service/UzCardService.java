package com.octo.uzb.carduzcard.service;

import com.octo.uzb.carduzcard.model.UzCard;
import com.octo.uzb.carduzcard.repository.UzcardRepository;
import com.octo.uzb.system.response.BaseResponse;
import com.octo.uzb.system.service.BaseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class UzCardService implements BaseService {
    @Autowired UzcardRepository repository;

    public BaseResponse getAll(){
        return SPECIAL(repository.findAll(), "ok", 200, true);
    }

    public BaseResponse getById(Long id){
        Optional<UzCard> optional = repository.findById(id);
        if (optional.isPresent()){
            SPECIAL(optional.get(), "ok", 200, true);
        }
        log.error("requested object not found");
        return DONT_EXIST(new UzCard());
    }

    public BaseResponse save(UzCard card){
        repository.save(card);
        return SUCCESS_ADDED(card);
    }

    public BaseResponse deleteById(Long id){
        Optional<UzCard> optional = repository.findById(id);
        if (optional.isPresent()){
            repository.deleteById(id);
            SPECIAL(optional.get(), "ok", 200, true);
        }
        log.error("requested object not found");
        return DONT_EXIST(new UzCard());
    }
}
