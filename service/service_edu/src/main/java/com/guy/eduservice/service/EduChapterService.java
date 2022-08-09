package com.guy.eduservice.service;

import com.guy.eduservice.entity.EduChapter;
import com.baomidou.mybatisplus.extension.service.IService;
import com.guy.eduservice.entity.chapter.ChapterVo;

import java.util.List;

/**
 * <p>
 * 课程 服务类
 * </p>
 *
 * @author GuY
 * @since 2022-08-07
 */
public interface EduChapterService extends IService<EduChapter> {

    //课程大纲列表，根据课程id进行查询
    List<ChapterVo> getChapterVideoByCourseId(String courseId);
}
