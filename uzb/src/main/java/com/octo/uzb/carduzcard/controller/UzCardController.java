package com.octo.uzb.carduzcard.controller;

import com.octo.uzb.cardhumo.model.HumoCard;
import com.octo.uzb.cardhumo.service.HumoService;
import com.octo.uzb.carduzcard.model.UzCard;
import com.octo.uzb.carduzcard.service.UzCardService;
import com.octo.uzb.system.response.BaseResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("uzcard")
public class UzCardController {
    @Autowired
    UzCardService service;

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
    public ResponseEntity<?> save(@RequestBody UzCard card){
        BaseResponse response = service.save(card);
        return ResponseEntity.status(response.isSuccess() ? 200 : 409).body(response.getData());
    }

    @PostMapping("{/id}")
    public ResponseEntity<?> deleteById(@PathVariable Long id){
        BaseResponse response = service.deleteById(id);
        return ResponseEntity.status(response.isSuccess() ? 200 : 400).body(response.getData());
    }
}
