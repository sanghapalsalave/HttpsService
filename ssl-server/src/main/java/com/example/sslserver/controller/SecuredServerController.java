package com.example.sslserver.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class SecuredServerController {

	@RequestMapping("/secured")
	public String secured() {
		System.out.println("Inside secured()");
		return "Hello Sanghapal  !!! : " + new Date();
	}
}
