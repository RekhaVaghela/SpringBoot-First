package controller;

@RestController
public class HomeController {
	@RequestMapping("/")
	
	public String home() {
		return "hello world";
	}

}
