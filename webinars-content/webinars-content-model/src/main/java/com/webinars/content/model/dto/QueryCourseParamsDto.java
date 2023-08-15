package com.webinars.content.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Classname QueryCourseParamsDto
 * @Description 课程查询条件模型类
 * @Version 1.0.0
 * @Date 2023/8/15 14:52
 * @Created by lzh
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class QueryCourseParamsDto {

    //审核状态
    private String auditStatus;
    //课程名字
    private String courseName;
    //发布状态
    private String publishStatus;

}
