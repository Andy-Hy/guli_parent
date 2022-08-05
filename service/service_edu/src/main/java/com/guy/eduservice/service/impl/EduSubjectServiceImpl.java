package com.guy.eduservice.service.impl;

import com.alibaba.excel.EasyExcel;
import com.guy.eduservice.entity.EduSubject;
import com.guy.eduservice.entity.excel.SubjectData;
import com.guy.eduservice.listener.SubjectExcelListener;
import com.guy.eduservice.mapper.EduSubjectMapper;
import com.guy.eduservice.service.EduSubjectService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;




/**
 * <p>
 * 课程科目 服务实现类
 * </p>
 *
 * @author GuY
 * @since 2022-08-04
 */
@Service
public class EduSubjectServiceImpl extends ServiceImpl<EduSubjectMapper, EduSubject> implements EduSubjectService {

    //添加课程分类
    @Override
    public void saveSubject(MultipartFile file,EduSubjectService subjectService) {
        try {
            //文件输入流
            InputStream in = file.getInputStream();
            //调用方法进行读取
            EasyExcel.read(in, SubjectData.class,new SubjectExcelListener(subjectService)).sheet().doRead();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
