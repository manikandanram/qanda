package com.QandA.controller;

import com.QandA.entity.QAndAEntity;
import com.QandA.service.QAndAService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class QAndAContoller {

    @Autowired
    private QAndAService qAndAService;

    @PostMapping("/save/qanda")
    public QAndAEntity saveQAndA(@RequestBody QAndAEntity qAndAEntity) {
        return qAndAService.saveQAndA(qAndAEntity);
    }

    @GetMapping("/view/qanda")
    public List<QAndAEntity> getQAndAList() {
        return qAndAService.getQAndAList();
    }

    @GetMapping("/view/qanda/{id}")
    public QAndAEntity getQAndA(@PathVariable int id) {
        return qAndAService.getQAndAById(id);
    }

    @PutMapping("/update/qanda/{id}")
    public QAndAEntity updateQAndA(@RequestBody QAndAEntity qAndAEntity, @PathVariable int id) {
        return qAndAService.updateQAndA(qAndAEntity, id);
    }

}
