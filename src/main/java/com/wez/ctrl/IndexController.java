package com.wez.ctrl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/index")
public class IndexController {

    @RequestMapping(value = "/toIndex", method = RequestMethod.GET)
    public String toIndex(String param) {
        return param;
    }

}
