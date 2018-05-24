package com.testinium.testdatapersister.core.service;

import com.mongodb.DBObject;
import com.testinium.testdatapersister.core.repository.TestDataRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by erdoganonur
 * on 23.05.2018.
 */
@Service
public class BucketService {

    @Autowired
    private MongoTemplate mongoTemplate;

    public List<String> getAllBuckets() {
        //TODO Should be implemented pageable.
        return mongoTemplate.getCollection("testData").distinct("bucket");
    }
}
