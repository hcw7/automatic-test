package com.yy.auto.console.web.controller.common;

import com.yy.auto.console.web.config.ConfigProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description: 健康检查
 */
@RestController
public class HealthController {

    @Resource
    ConfigProperties configProperties;

    @RequestMapping("/config")
    public String config(){
        return "skynet, hello word!!Environment.name=" + configProperties.getEnvironmentName()
                + ">>>Environment.code=" + configProperties.getEnvironmentCode()
                + ">>>ExcelPath=" + configProperties.getExcelPath();
    }

}
