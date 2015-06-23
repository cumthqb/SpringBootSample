package com.sample.project.service.module;

import com.sample.project.entity.module.Sample;
import com.sample.project.pojo.module.SampleVO;
import com.sample.project.mapper.module.SampleMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description:简单的服务
 */
@Service
public class SampleService {
    private static final Logger logger = LoggerFactory.getLogger(SampleService.class);
    @Autowired
    SampleMapper sampleMapper;

    public SampleVO getSample(String userId) {
        Sample sample = sampleMapper.getSample(userId);

        logger.info("获取用户：{} 结果为：{}", userId, sample);

        SampleVO sampleVO = new SampleVO();

        if (sample != null)
            BeanUtils.copyProperties(sample, sampleVO);

        return sampleVO;
    }
}
