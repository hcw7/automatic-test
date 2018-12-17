package com.yy.auto.console.web.controller.common;

import com.yy.auto.console.web.config.ConfigProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * HelloController
 *
 * @author hcw7
 * @date 2018/3/8
 */
@RestController
public class HelloController {
    private Logger logger = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping("/")
    @ResponseBody
    public String index(){
		logger.info(">>>>visit skynet>>>");
        return "skynet, hello word!!Environment.name=" + configProperties.getEnvironmentName()
                + ">>>Environment.code=" + configProperties.getEnvironmentCode()
                + ">>>ExcelPath=" + configProperties.getExcelPath();
    }


    @Resource
    ConfigProperties configProperties;

}
