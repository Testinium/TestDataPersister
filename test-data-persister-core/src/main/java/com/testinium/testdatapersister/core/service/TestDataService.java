package com.testinium.testdatapersister.core.service;

import com.testinium.testdatapersister.core.entity.TestData;
import com.testinium.testdatapersister.core.repository.TestDataRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author erdoganonur on 11.04.2018
 */
@Service
public class TestDataService {

    @Autowired
    private TestDataRepo testDataRepo;

    /**
     * @param page
     * @param pageSize
     * @return
     */
    public List<TestData> getAll(int page, int pageSize) {
        Pageable pageable = new PageRequest(page, pageSize);
        Page<TestData> resultPage = getAll(pageable);
        return resultPage.getContent();
    }

    /**
     * @param pageable
     * @return
     */
    public Page<TestData> getAll(Pageable pageable) {
        Page<TestData> resultPage = testDataRepo.findAll(pageable);
        return resultPage;
    }

    /**
     * @param bucket
     * @param page
     * @param pageSize
     * @return
     */
    public List<TestData> getAllByBucket(String bucket, int page, int pageSize) {

        Pageable pageable = new PageRequest(page, pageSize);
        Page<TestData> resultPage = getAllByBucket(bucket, pageable);
        return resultPage.getContent();
    }

    /**
     * @param bucket
     * @param pageable
     * @return
     */
    public Page<TestData> getAllByBucket(String bucket, Pageable pageable) {

        Page<TestData> resultPage = testDataRepo.findByBucket(bucket, pageable);
        return resultPage;
    }

    /**
     * @param testData
     * @param bucket
     * @return
     */
    public TestData putForBucket(TestData testData, String bucket) {

        testData.setBucket(bucket);
        return testDataRepo.save(testData);
    }


}
