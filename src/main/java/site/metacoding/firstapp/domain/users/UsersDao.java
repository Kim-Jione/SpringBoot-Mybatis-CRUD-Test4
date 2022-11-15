package site.metacoding.firstapp.domain.users;

import java.util.List;

import site.metacoding.firstapp.web.dto.request.LoginDto;
import site.metacoding.firstapp.web.dto.request.UsersListDto;

public interface UsersDao {
	public Users adminLogin(LoginDto loginDto);

	public Users memberLogin(LoginDto loginDto);

	public void insert(Users users);

	public Users findById(Integer usersId);

	public Users findByUsername(String username);

	public List<Users> findAll();

	public void update(Users user);

	public void delete(Integer usersId);

	public List<UsersListDto> adminList();

	public List<UsersListDto> membersList();

	public UsersListDto adminFindById(Integer usersId);

	

	public void updateUsers(UsersListDto usersListDtoPS);

}