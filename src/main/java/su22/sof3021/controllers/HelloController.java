package su22.sof3021.controllers;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//@RequestMapping("/admin/users")
public class HelloController {
	
	@RequestMapping(
		value="/hello",
		method=RequestMethod.GET
	)
//	@GetMapping("hello")
	public String hello(
		Model model, 
		@RequestParam(name="name") Optional<String> name
	) {
		// Cách 1: defaultValue
		// name = name.length() == 0 ? "IT16308" : name;
		// model.addAttribute("name", name);

		// Cách 2: Optional<T>
		String nameValue = !name.isPresent() ? "IT16308" : name.get();
		model.addAttribute("name", nameValue);
		return "hello";
	}
}
