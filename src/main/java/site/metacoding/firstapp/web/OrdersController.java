package site.metacoding.firstapp.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class OrdersController {

	@GetMapping("/orders/ordersList")
	public String ordersList(Model model) {
		return "orders/orderListForm";
	}

}
