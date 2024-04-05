package uz.pdp.backend.service.userService;

import uz.pdp.backend.dto.LoginDTO;
import uz.pdp.backend.model.user.User;
import uz.pdp.backend.service.BaseService;

public interface UserService extends BaseService<User> {
    User login(LoginDTO login);
}
