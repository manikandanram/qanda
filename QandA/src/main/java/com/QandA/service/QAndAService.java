package com.QandA.service;

import com.QandA.entity.QAndAEntity;
import com.QandA.repository.QAndARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QAndAService {

    @Autowired
    private QAndARepository qandARepository;

    public QAndAEntity saveQAndA(QAndAEntity qandaEntity) {
        qandARepository.save(qandaEntity);
        return qandaEntity;
    }

    public ArrayList<QAndAEntity>  getQAndAList() {
        return (ArrayList<QAndAEntity>) qandARepository.findAll();
    }

    public QAndAEntity getQAndAById(int id) {
        return qandARepository.findById(id).orElseThrow();
    }

    public QAndAEntity updateQAndA(QAndAEntity qandaEntity, int id) {
        return qandARepository.findById(id)
                .map(e -> {
                    return qandARepository.save(qandaEntity);
                })
                .orElseGet(() -> {
                    return qandARepository.save(qandaEntity);
                });
    }

}
