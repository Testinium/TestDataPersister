package com.testinium.testdatapersister.controller;

import com.testinium.testdatapersister.core.entity.TestData;
import com.testinium.testdatapersister.core.service.TestDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

/**
 * @author erdoganonur on 11.04.2018
 */
@RestController
@RequestMapping("/data")
public class TestDataController {

    @Autowired
    private TestDataService testDataService;


    @RequestMapping(value = "/", method = RequestMethod.GET)
    private Page<TestData> getAll(Pageable pageable) {
        return testDataService.getAll(pageable);
    }

    @RequestMapping(value = "/{bucket}", method = RequestMethod.GET)
    private Page<TestData> getAllByBucket(@PathVariable String bucket, Pageable pageable) {
        return testDataService.getAllByBucket(bucket, pageable);
    }

    @RequestMapping(value = "/{bucket}", method = RequestMethod.PUT)
    private TestData putForBucket(@PathVariable String bucket, @RequestBody TestData testData) {

        System.out.println(bucket);
        return testDataService.putForBucket(testData, bucket);
    }
}
