package com.testinium.testdatapersister.controller;

import com.testinium.testdatapersister.core.service.BucketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by erdoganonur
 * on 23.05.2018.
 */
@RestController
@RequestMapping("/bucket")
public class BucketController {

    @Autowired
    private BucketService bucketService;

    @RequestMapping(method = RequestMethod.GET)
    private List<String> getAll() {
        return bucketService.getAllBuckets();
    }
}
