package com.webinars.content.api;

import com.webinars.base.model.PageParams;
import com.webinars.base.model.PageResult;
import com.webinars.content.model.dto.QueryCourseParamsDto;
import com.webinars.content.model.po.CourseBase;
import com.webinars.content.service.CourseBaseInfoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Classname CourseBaseInfoController
 * @Description 课程查询接口
 * @Version 1.0.0
 * @Date 2023/8/15 15:15
 * @Created by lzh
 */
@RestController
public class CourseBaseInfoController {

    @Resource
    CourseBaseInfoService courseBaseInfoService;

    //课程查询接口
    @PostMapping("/course/list")
    public PageResult<CourseBase> list(PageParams pageParams,@RequestBody(required = false) QueryCourseParamsDto queryCourseParamsDto){
        return courseBaseInfoService.queryCourseBaseList(pageParams, queryCourseParamsDto);
    }


}
