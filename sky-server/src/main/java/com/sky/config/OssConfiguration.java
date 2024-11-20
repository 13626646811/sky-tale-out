package com.sky.config;

import com.sky.properties.AliOssProperties;
import com.sky.utils.AliOssUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName: OssConfiguration
 * Package: com.sky.config
 * Description:配置类 用于创建AlOssUtils
 *
 * @Author clf
 * @Create 2024/11/15 16:02
 * @Version 1.0
 */

@Configuration
@Slf4j

public class OssConfiguration {

   @Bean
   @ConditionalOnMissingBean  //没有bean的时候创建，确保只有一个
    public AliOssUtil aliOssUtil(AliOssProperties aliOssProperties){
        log.info("开始上传阿里云文件上传工具类对象:{}",aliOssProperties);
        return    new AliOssUtil(aliOssProperties.getEndpoint(),
                    aliOssProperties.getAccessKeyId(),
                    aliOssProperties.getAccessKeySecret(),
                    aliOssProperties.getBucketName());
    }
}
