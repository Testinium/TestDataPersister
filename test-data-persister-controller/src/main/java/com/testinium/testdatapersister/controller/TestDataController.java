package com.testinium.testdatapersister.controller;

import com.testinium.testdatapersister.core.entity.TestData;
import com.testinium.testdatapersister.core.service.TestDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author erdoganonur on 11.04.2018
 */
@RestController
@RequestMapping("/api/test/data")
public class TestDataController {

    @Autowired
    private TestDataService testDataService;


    @RequestMapping(value = "/", method = RequestMethod.GET)
    private Page<TestData> getAll(Pageable pageable) {
        return testDataService.getAll(pageable);
    }

    @RequestMapping(value = "/{containder}", method = RequestMethod.GET)
    private Page<TestData> getAllByContainer(@PathVariable String container, Pageable pageable) {
        return testDataService.getAllByContainer(container, pageable);
    }
}
