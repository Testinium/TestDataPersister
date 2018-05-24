package com.testinium.testdatapersister.core.repository;

import com.testinium.testdatapersister.core.entity.TestData;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * @author erdoganonur on 11.04.2018
 */
public interface TestDataRepo extends MongoRepository<TestData, Long> {

    Page<TestData> findByBucket(String bucket, Pageable pageable);
}
