package com.webinars.content.service;

import com.webinars.base.model.PageParams;
import com.webinars.base.model.PageResult;
import com.webinars.content.model.dto.QueryCourseParamsDto;
import com.webinars.content.model.po.CourseBase;

/**
 * @Classname CourseBaseInfoService
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/8/18 15:35
 * @Created by lzh
 */
public interface CourseBaseInfoService {

    //课程分页查询
    public PageResult<CourseBase> queryCourseBaseList(PageParams pageParams, QueryCourseParamsDto courseParamsDto);

}
