package site.metacoding.firstapp.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.RequiredArgsConstructor;
import site.metacoding.firstapp.domain.admin.AdminDao;
import site.metacoding.firstapp.domain.users.UsersDao;
import site.metacoding.firstapp.web.dto.request.UsersListDto;

@RequiredArgsConstructor
@Controller
public class UsersController {

	private final UsersDao usersDao;
	private final AdminDao adminDao;

	@GetMapping("/users/list")
	public String usersList(Model model) {
		model.addAttribute("admin", usersDao.adminList());
		model.addAttribute("member", usersDao.membersList());
		return "users/listForm";
	}

	@GetMapping("/admin/{usersId}/update")
	public String usersUpdate(@PathVariable Integer usersId, Model model) {
		model.addAttribute("admin", usersDao.adminFindById(usersId));
		return "users/adminUpdateForm";
	}

	@PostMapping("/admin/{usersId}/update")
	public String update(UsersListDto usersListDto) {
		adminDao.updateAdmin(usersListDto);
		usersDao.updateUsers(usersListDto);
		return "redirect:/users/list";
	}
}