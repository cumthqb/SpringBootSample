package com.sample.project.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.embedded.ServletContextInitializer;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;

import javax.servlet.DispatcherType;
import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import java.util.EnumSet;

/**
 * Description:基于servlet3.x 设置过滤器、监听器等，一般是web.xml的配置
 */
@Configuration
public class WebConfig implements ServletContextInitializer {
    private final static Logger logger = LoggerFactory.getLogger(WebConfig.class);

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        EnumSet<DispatcherType> dispatcherTypes = EnumSet.of(DispatcherType.REQUEST, DispatcherType.FORWARD, DispatcherType.ASYNC, DispatcherType.INCLUDE);

        initCharsetFilter(servletContext, dispatcherTypes);

        logger.info("servlet初始化完毕");
    }

    /**
     * 字符集过滤器  just for example,spring boot can set charset use application.yml
     *
     * @param servletContext
     */
    private void initCharsetFilter(ServletContext servletContext, EnumSet<DispatcherType> dispatcherTypes) {
        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
        characterEncodingFilter.setEncoding("UTF-8");
        characterEncodingFilter.setForceEncoding(true);
        FilterRegistration.Dynamic charsetRegistry = servletContext.addFilter("characterEncodingFilter", characterEncodingFilter);

        charsetRegistry.addMappingForUrlPatterns(dispatcherTypes, true, "/*");
    }
}
