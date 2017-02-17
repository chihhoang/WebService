package com.web.service.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.web.service.dto.StudentDto;

@Controller
public class JsonController {

	@RequestMapping(value = "/getAllStudents.htm", method = RequestMethod.GET)
	@ResponseBody
	public List<StudentDto> getAllStudents() {

		StudentDto dto1 = new StudentDto();
		dto1.setName("Chi");
		dto1.setAddress("USA");
		dto1.setPhoneNo("22424532");
		dto1.setStudentId(111);

		StudentDto dto2 = new StudentDto();
		dto2.setName("Chi");
		dto2.setAddress("USA");
		dto2.setPhoneNo("22424532");
		dto2.setStudentId(111);

		List<StudentDto> list = new ArrayList<>();
		list.add(dto1);
		list.add(dto2);

		return list;
	}

	@RequestMapping(value = "/getById.htm", method = RequestMethod.GET)
	@ResponseBody
	public StudentDto getById(@RequestParam("id") Integer id) {
		// testing ?id=55 so not using id param
		StudentDto dto1 = new StudentDto();
		dto1.setName("Chi");
		dto1.setAddress("USA");
		dto1.setPhoneNo("22424532");
		dto1.setStudentId(111);

		return dto1;
	}

	// Get Student object
	@RequestMapping(value = "/getStudent.htm", method = RequestMethod.POST)
	@ResponseBody
	public StudentDto getStudent(@RequestBody StudentDto dto) {

		return dto;

	}

}
