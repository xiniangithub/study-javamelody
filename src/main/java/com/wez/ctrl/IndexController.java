package com.wez.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/index")
public class IndexController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping(value = "/toIndex", method = RequestMethod.GET)
    public List<Map<String, Object>> toIndex(String param) {
        String sql = "select * from dual";
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);
        return maps;
    }

}
