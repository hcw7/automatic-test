package com.yy.auto.console.web.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 通用参数
 * 
 * @author hcw7
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
