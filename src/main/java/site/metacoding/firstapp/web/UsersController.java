package site.metacoding.firstapp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class UsersController {
	@GetMapping("/user/saveList")
	public String saveList() {
		return "users/userListForm";
	}

}