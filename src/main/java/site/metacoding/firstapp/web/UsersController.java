package site.metacoding.firstapp.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.RequiredArgsConstructor;
import site.metacoding.firstapp.domain.admin.AdminDao;
import site.metacoding.firstapp.domain.members.MembersDao;
import site.metacoding.firstapp.domain.users.UsersDao;
import site.metacoding.firstapp.web.dto.response.SaveListDto;
import site.metacoding.firstapp.web.dto.response.UsersListDto;

@RequiredArgsConstructor
@Controller
public class UsersController {

	private final UsersDao usersDao;
	private final AdminDao adminDao;
	private final MembersDao membersDao;

	// 유저 목록보기
	@GetMapping("/users/list")
	public String usersList(Model model) {
		model.addAttribute("admin", usersDao.adminList());
		model.addAttribute("member", usersDao.membersList());
		return "users/listForm";
	}

	// 관리자 수정하기
	@GetMapping("/admin/{usersId}/update")
	public String adminUpdate(@PathVariable Integer usersId, Model model) {
		model.addAttribute("admin", usersDao.adminFindById(usersId));
		return "users/adminUpdateForm";
	}

	// 관리자 수정하기
	@PostMapping("/admin/{usersId}/update")
	public String adminUpdate(UsersListDto usersListDto) {
		adminDao.updateAdmin(usersListDto);
		usersDao.updateUsers(usersListDto);
		return "redirect:/users/list";
	}

	// 구매자 수정하기
	@GetMapping("/members/{usersId}/update")
	public String membersUpdate(@PathVariable Integer usersId, Model model) {
		model.addAttribute("member", usersDao.membersFindById(usersId));
		return "users/membersUpdateForm";
	}

	// 구매자 수정하기
	@PostMapping("/members/{usersId}/update")
	public String membersUpdate(UsersListDto usersListDto) {
		membersDao.updateMembers(usersListDto);
		usersDao.updateUsers(usersListDto);
		return "redirect:/users/list";
	}

	// 삭제하기
	@PostMapping("/members/{usersId}/delete")
	public String membersDelete(@PathVariable Integer usersId) {
		usersDao.delete(usersId);
		membersDao.delete(usersId);
		return "redirect:/users/list";
	}

	// 삭제하기
	@PostMapping("/admin/{usersId}/delete")
	public String adminDelete(@PathVariable Integer usersId) {
		usersDao.delete(usersId);
		adminDao.delete(usersId);
		return "redirect:/users/list";
	}

	// 유저 목록보기
	@GetMapping("/save/list")
	public String saveList(Model model) {
		List<SaveListDto> saveListDto = usersDao.saveList();
		model.addAttribute("saveList", saveListDto);
		return "users/saveListForm";
	}
}