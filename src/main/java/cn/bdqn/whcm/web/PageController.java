package cn.bdqn.whcm.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import cn.bdqn.whcm.pojo.Student;
import cn.bdqn.whcm.service.StudentService;

@Controller
@SessionAttributes("list")
@RequestMapping("/page")
public class PageController {

		@RequestMapping("/{page}")
		public String toPage(@PathVariable String page) {
			return page;
		}
		
}
