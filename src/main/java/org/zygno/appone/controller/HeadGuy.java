package org.zygno.appone.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hg")
public class HeadGuy {

	@GetMapping("hey")
	public String rUThere() {
		return "Uh, Yeah";
	}
}
