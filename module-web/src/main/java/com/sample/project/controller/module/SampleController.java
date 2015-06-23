package com.sample.project.controller.module;

import com.sample.project.controller.BaseController;
import com.sample.project.pojo.module.SampleVO;
import com.sample.project.service.module.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Desc:简单的http处理
 */
@RestController
@RequestMapping("/sample")
public class SampleController extends BaseController {

    @Autowired
    SampleService sampleService;

    @RequestMapping("/{userId}")
    public SampleVO querySampe(@PathVariable String userId) {
        return sampleService.getSample(userId);
    }
}