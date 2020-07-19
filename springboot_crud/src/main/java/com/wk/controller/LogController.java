package com.wk.controller;

import com.wk.entity.LogPojo;
import com.wk.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author Wangkun
 * @date 2020/7/18
 * @description
 **/
@Controller
public class LogController {
    @Autowired
    private LogService logService;

    /**
     * 查询全部日志
     *
     * @return
     */
    @GetMapping("queryLog")
    public String queryLog(Model model) {
        List<LogPojo> logPojoList = logService.selectAll();
        model.addAttribute("logPojoList", logPojoList);
        return "loglist";

    }

    /**
     * 删除一条日志
     * @param lid
     * @param model
     * @return
     */
    @GetMapping("delLog")
    public String delLog(@RequestParam("lid") final Integer lid, Model model) {
        int i = logService.deleteByPrimaryKey(lid);
        return this.queryLog(model);
    }
}
