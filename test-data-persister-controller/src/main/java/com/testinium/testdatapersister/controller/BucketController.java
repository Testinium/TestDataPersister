package com.testinium.testdatapersister.controller;

import com.testinium.testdatapersister.core.service.BucketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
    private Page<String> getAllByBucket(Pageable pageable) {
        return bucketService.getAllBuckets(pageable);
    }

}
