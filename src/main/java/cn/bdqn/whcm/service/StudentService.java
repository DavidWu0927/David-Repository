package cn.bdqn.whcm.service;

import java.util.List;

import cn.bdqn.whcm.pojo.Student;

public interface StudentService {

	List<Student> select(String currPage,String pageSize);
}
