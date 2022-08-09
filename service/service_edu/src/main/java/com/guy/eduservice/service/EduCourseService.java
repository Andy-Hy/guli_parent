package com.guy.eduservice.service;

import com.guy.eduservice.entity.EduCourse;
import com.baomidou.mybatisplus.extension.service.IService;
import com.guy.eduservice.entity.vo.CourseInfoVo;

/**
 * <p>
 * 课程 服务类
 * </p>
 *
 * @author GuY
 * @since 2022-08-07
 */
public interface EduCourseService extends IService<EduCourse> {

    //添加课程基本信息的方法
   String saveCourseInfo(CourseInfoVo courseInfoVo);
}
