package site.metacoding.firstapp.web.dto.response;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UsersListDto {
	private Integer usersId;
	private String username;
	private String membersName;
	private String membersEmail;
	private String adminName;
	private String adminEmail;
	private String role;
	private Timestamp createdAt;

	public void update(UsersListDto usersListDto) {
		this.username = usersListDto.getUsername();
		this.membersName = usersListDto.getMembersName();
		this.membersEmail = usersListDto.getAdminEmail();
		this.role = usersListDto.getRole();
	}
}
