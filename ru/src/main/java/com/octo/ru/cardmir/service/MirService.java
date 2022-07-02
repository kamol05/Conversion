package com.octo.ru.cardmir.service;

import com.octo.ru.cardmir.model.MirCard;
import com.octo.ru.cardmir.repository.MirRepository;
import com.octo.ru.system.response.BaseResponse;
import com.octo.ru.system.service.BaseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
@Slf4j
public class MirService implements BaseService {
    @Autowired
    MirRepository repository;

    public BaseResponse getAll(){
        return SPECIAL(repository.findAll(), "ok", 200, true);
    }

    public BaseResponse getById(Long id){
        Optional<MirCard> optional = repository.findById(id);
        if (optional.isPresent()){
            SPECIAL(optional.get(), "ok", 200, true);
        }
        log.error("requested object not found");
        return DONT_EXIST(new MirCard());
    }

    public BaseResponse save(MirCard card){
        repository.save(card);
        return SUCCESS_ADDED(card);
    }

    public BaseResponse deleteById(Long id){
        Optional<MirCard> optional = repository.findById(id);
        if (optional.isPresent()){
            repository.deleteById(id);
            SPECIAL(optional.get(), "ok", 200, true);
        }
        log.error("requested object not found");
        return DONT_EXIST(new MirCard());
    }
}
