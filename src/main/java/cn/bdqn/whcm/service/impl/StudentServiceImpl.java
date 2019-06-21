package cn.bdqn.whcm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.bdqn.whcm.dao.StudentMapper;
import cn.bdqn.whcm.pojo.Student;
import cn.bdqn.whcm.pojo.StudentExample;
import cn.bdqn.whcm.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentMapper mapper;
	
	
	@Override
	public List<Student> select(String currPage,String pageSize) {
		StudentExample example= new StudentExample();
		return mapper.selectByExample(example);
	}

}
