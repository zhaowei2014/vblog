package com.dev.vblog.controller;

import com.dev.vblog.service.VblogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * TODO:DOCUMENT ME!
 *
 * @author zw
 * @date 2020/8/31
 */
@RestController
@Validated
public class VblogController {

    @Autowired
    private VblogService service;

    @RequestMapping("pageList")
    public Object pageList(@RequestParam(defaultValue = "0") Integer page,
                           @RequestParam(defaultValue = "2") Integer size) {
        return service.pageList(page, size);
    }

    @RequestMapping("index")
    public ModelAndView pageList() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }

}
