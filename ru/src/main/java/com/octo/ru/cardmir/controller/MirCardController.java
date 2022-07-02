package com.octo.ru.cardmir.controller;

import com.octo.ru.cardmir.model.MirCard;
import com.octo.ru.cardmir.service.MirService;
import com.octo.ru.system.response.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("mir")
public class MirCardController {
    @Autowired
    MirService service;

    @GetMapping
    public ResponseEntity<?> getAll(){
        BaseResponse response = service.getAll();
        return ResponseEntity.status(response.isSuccess() ? 200 : 409).body(response.getData());
    }

    @GetMapping("{/id}")
    public ResponseEntity<?> getById(@PathVariable Long id){
        BaseResponse response = service.getById(id);
        return ResponseEntity.status(response.isSuccess() ? 200 : 400).body(response.getData());
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody MirCard card){
        BaseResponse response = service.save(card);
        return ResponseEntity.status(response.isSuccess() ? 200 : 409).body(response.getData());
    }

    @PostMapping("{/id}")
    public ResponseEntity<?> deleteById(@PathVariable Long id){
        BaseResponse response = service.deleteById(id);
        return ResponseEntity.status(response.isSuccess() ? 200 : 400).body(response.getData());
    }
}
