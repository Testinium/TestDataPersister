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
     * @param container
     * @param page
     * @param pageSize
     * @return
     */
    public List<TestData> getAllByContainer(String container, int page, int pageSize) {

        Pageable pageable = new PageRequest(page, pageSize);
        Page<TestData> resultPage = getAllByContainer(container, pageable);
        return resultPage.getContent();
    }

    /**
     * @param container
     * @param pageable
     * @return
     */
    public Page<TestData> getAllByContainer(String container, Pageable pageable) {

        Page<TestData> resultPage = testDataRepo.findByContainer(container, pageable);
        return resultPage;
    }

    /**
     * @param testData
     * @param container
     * @return
     */
    public TestData putForContainer(TestData testData, String container) {

        testData.setContainer(container);
        return testDataRepo.save(testData);
    }


}
