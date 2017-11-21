package org.zygno.appone.controller;

import javax.annotation.Resource;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hg")
public class HeadGuy {
	@Resource Environment env;

	@GetMapping("hey")
	public String rUThere() {
		String prop = env.getProperty("named-environment.raft.val1");
		return "Uh, Yeah " + prop;
	}
}
