package com.webinars.base.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Classname PageParams
 * @Description 分页参数
 * @Version 1.0.0
 * @Date 2023/8/15 14:46
 * @Created by lzh
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageParams {

    //分页页码
    private Long pageNo = 1L;
    //每页显示记录数
    private Long pageSize = 30L;

}
