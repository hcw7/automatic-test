package com.yy.auto.console.web.frame.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * common config 4 properties
 *
 * @author hcw7
 * @date 2018-12-20
 */
@Component
@ConfigurationProperties
public class ConfigProperties {

	@Value("${share.excel.path}")
	private String excelPath;


    @Value("${environment.name}")
    private String environmentName;

    @Value("${environment.code}")
    private String environmentCode;

    public String getExcelPath() {
        return excelPath;
    }

    public void setExcelPath(String excelPath) {
        this.excelPath = excelPath;
    }

    public String getEnvironmentName() {
        return environmentName;
    }

    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }

    public String getEnvironmentCode() {
        return environmentCode;
    }

    public void setEnvironmentCode(String environmentCode) {
        this.environmentCode = environmentCode;
    }
}
