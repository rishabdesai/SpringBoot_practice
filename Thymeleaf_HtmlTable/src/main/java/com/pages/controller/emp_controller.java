package com.pages.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pages.model.Emp;

@Controller

@RequestMapping("/emp")
public class emp_controller {

	private List<Emp> empList;

	@PostConstruct
	public void getData() {

		Emp emp1 = new Emp(1, "fname1", "lname1", "1@mail.com");
		Emp emp2 = new Emp(2, "fname2", "lname2", "2@mail.com");
		Emp emp3 = new Emp(3, "fname3", "lname3", "3@mail.com");
		Emp emp4 = new Emp(4, "fname4", "lname4", "4@mail.com");

		empList = new ArrayList<>();

		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);

	}

	@GetMapping("/list")
	public String showEmp(Model model) {
		model.addAttribute("elist", empList);
		return "indexPage";

	}

}
