package site.metacoding.firstapp.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.RequiredArgsConstructor;
import site.metacoding.firstapp.domain.members.MembersDao;
import site.metacoding.firstapp.domain.orders.OrdersDao;
import site.metacoding.firstapp.domain.product.ProductDao;
import site.metacoding.firstapp.domain.users.UsersDao;
import site.metacoding.firstapp.web.dto.request.OrdersProductDto;

@RequiredArgsConstructor
@Controller
public class OrdersController {
	private final UsersDao usersDao;
	private final OrdersDao ordersDao;
	private final MembersDao membersDao;
	private final ProductDao productDao;

	// 삭제하기
	@PostMapping("/members/{usersId}/delete")
	public String membersDelete(@PathVariable Integer usersId) {
		usersDao.delete(usersId);
		membersDao.delete(usersId);
		return "redirect:/users/list";
	}

}
