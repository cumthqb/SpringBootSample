package com.sample.project.mapper.module;

import com.sample.project.entity.module.Sample;
import org.apache.ibatis.annotations.Param;

/**
 * Description:
 */
public interface SampleMapper {
    public Sample getSample(String userId);

    public int add(@Param("vo") Sample sample);

    public int update(@Param("vo") Sample sample);
}

