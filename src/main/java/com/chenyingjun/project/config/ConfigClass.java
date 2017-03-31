package com.chenyingjun.project.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * 
 * 
 * @author chenyingjun
 * @since 1.0
 * @version 2017年3月31日 chenyingjun
 */
@Configuration
@ImportResource(value = { "classpath:applicationContext*.xml" })
public class ConfigClass {

}
