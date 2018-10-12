package com.btk.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSecurityController {
	
	
	@GetMapping("/secret")
	public String actionSecrete() {
		return "ceci est un secret, Gardez le !!!";
	}

	@GetMapping("/public")
	public String actionPublic() {
		return "ceci est de l'ordre du public !!!";
	}

}
