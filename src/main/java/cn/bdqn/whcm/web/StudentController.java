package cn.bdqn.whcm.web;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.bdqn.whcm.pojo.Student;
import cn.bdqn.whcm.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService service;
	
	@RequestMapping("/index")
	public String bbb(Model model,String currPage,String pageSize) {
		System.out.println(currPage);
		System.out.println(pageSize);
		List<Student> list = service.select("1","3");
		model.addAttribute("list", list);
		return "index";
	}
	
	@RequestMapping("/regist")
	public String delete(@Valid Student student,BindingResult result,Model model) {
		if(result.hasErrors()) { //�ж���֤���Ƿ��д�
			List<ObjectError> list = result.getAllErrors();//ȡ�����еĴ�����Ϣ
			for (ObjectError objectError : list) {
				//ѭ���������Ϣ�����ҽ��������Ϣ�ŵ�model��
				model.addAttribute(((FieldError)objectError).getField(), objectError.getDefaultMessage());
			}
			return "regist";
		}else {
			return "index";
		}
	}
}
