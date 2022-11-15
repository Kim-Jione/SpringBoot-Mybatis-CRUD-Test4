package site.metacoding.firstapp.domain.admin;

import java.util.List;

import site.metacoding.firstapp.web.dto.request.UsersListDto;

public interface AdminDao {

	public void insert(Admin admin);

	public Admin findById(Integer adminId);

	public List<Admin> findAll(Integer adminId);

	public void update(Admin admin);

	public void delete(Integer adminId);

	public void updateAdmin(UsersListDto usersListDtoPS);
}
