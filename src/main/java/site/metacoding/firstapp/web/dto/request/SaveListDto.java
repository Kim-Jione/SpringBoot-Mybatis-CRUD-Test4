package site.metacoding.firstapp.web.dto.request;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SaveListDto {
	private Integer productId;
	private Integer membersId;
	private Integer ordersCount;
}
