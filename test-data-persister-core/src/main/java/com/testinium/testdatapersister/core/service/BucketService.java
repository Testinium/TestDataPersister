package com.testinium.testdatapersister.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
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

    public Page<String> getAllBuckets(Pageable pageable) {
        //TODO Should be implemented pageable.


        Query query = new Query();
        query.with(pageable);

        List bucketList = mongoTemplate.getCollection("testData").distinct("bucket", query.getQueryObject());

        Page<String> page = new PageImpl<>(bucketList,
                new PageRequest(pageable.getPageNumber(), pageable.getPageSize(), pageable.getSort()),
                bucketList.size());

        return page;
    }
}
