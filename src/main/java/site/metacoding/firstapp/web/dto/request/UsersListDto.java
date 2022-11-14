package site.metacoding.firstapp.web.dto.request;

import java.sql.Timestamp;

import lombok.Getter;

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

}