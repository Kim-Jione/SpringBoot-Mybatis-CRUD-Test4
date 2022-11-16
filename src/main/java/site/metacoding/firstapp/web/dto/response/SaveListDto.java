package site.metacoding.firstapp.web.dto.response;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SaveListDto {
	private Integer ordersId;
	private Integer productId;
	private String username;
	private String ordersMember;
	private String ordersName;
	private Integer ordersPrice;
	private Integer ordersCount;
	private Timestamp createdAt;
}
