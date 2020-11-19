package com.dev.Pt_DadamCRM.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class PageController {

	@GetMapping("/")
	public String main() {
		log.info("홈 화면 접속");
		return "main";
	}
}
