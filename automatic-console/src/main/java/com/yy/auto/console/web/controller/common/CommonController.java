package com.yy.auto.console.web.controller.common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * login action
 *
 * @author hcw7
 * @date 2018-12-20
 */
@Controller
@RequestMapping("template")
public class CommonController {

    @RequestMapping("/form1")
    public String form1() {
        return "common/form1";
    }

    @RequestMapping("/form2")
    public String form2() {
        return "common/form2";
    }


    @RequestMapping("/table1")
    public String table1() {
        return "common/table1";
    }


    @RequestMapping("/table2")
    public String table2() {
        return "common/table2";
    }

}
