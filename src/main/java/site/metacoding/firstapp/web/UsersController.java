package site.metacoding.firstapp.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;
import site.metacoding.firstapp.domain.users.UsersDao;

@RequiredArgsConstructor
@Controller
public class UsersController {

	private final UsersDao usersDao;

	@GetMapping("/users/list")
	public String usersList(Model model) {

		model.addAttribute("admin", usersDao.adminList());
		model.addAttribute("member", usersDao.membersList());

		return "users/userListForm";
	}

}