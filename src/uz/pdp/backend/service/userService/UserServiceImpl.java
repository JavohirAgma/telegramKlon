package uz.pdp.backend.service.userService;

import uz.pdp.backend.dto.LoginDTO;
import uz.pdp.backend.model.chat.Chat;
import uz.pdp.backend.model.user.User;

import java.util.*;

public class UserServiceImpl implements UserService{

    List<User> userlist;
    public UserServiceImpl(){
        this.userlist = new ArrayList<>();
        this.userlist.add(new User("akmal",998548381,11));
    }

    @Override
    public boolean create(User user) {
        return false;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public void update(User newM) {

    }

    @Override
    public User get(String id) {
        return null;
    }

    @Override
    public User login(LoginDTO login) {
        for (User user : userlist) {
            if (Objects.equals(user.getUserName(),login.username())
                    && Objects.equals(user.getPassword(),login.password())){
                return user;
            }
        }
        User user = new User(login.username(), login.number(), login.password());
        userlist.add(user);
        return user;
    }
    static UserService userService;
    public static UserService getInstance(){
        if (userService==null){
            userService = new UserServiceImpl();
        }
        return userService;
    }
}
