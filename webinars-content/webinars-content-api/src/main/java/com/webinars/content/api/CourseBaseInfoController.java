package com.webinars.content.api;

import com.webinars.base.model.PageParams;
import com.webinars.base.model.PageResult;
import com.webinars.content.model.dto.QueryCourseParamsDto;
import com.webinars.content.model.po.CourseBase;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname CourseBaseInfoController
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/8/15 15:15
 * @Created by lzh
 */
@RestController
public class CourseBaseInfoController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
    @PostMapping("/course/list")
    public PageResult<CourseBase> list(PageParams pageParams,@RequestBody(required = false) QueryCourseParamsDto queryCourseParamsDto){
        return null;
    }


}
