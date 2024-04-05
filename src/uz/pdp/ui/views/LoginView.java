package uz.pdp.ui.views;

import uz.pdp.backend.dto.LoginDTO;
import uz.pdp.backend.model.user.User;
import uz.pdp.backend.service.userService.UserService;
import uz.pdp.backend.service.userService.UserServiceImpl;
import uz.pdp.ui.utils.ScanUtil;

public class LoginView {
    static UserService userService = UserServiceImpl.getInstance();

    public static User logIn(){
        System.out.println("Enter Login info");
        String username = ScanUtil.strScan("username: ");
        Integer number = ScanUtil.intScan("number: ");
        Integer password = ScanUtil.intScan("password: ");
        User login = userService.login( new LoginDTO(username, number ,password));
        return login;
    }
    public static Integer menu(){
        System.out.println("""
                Login Menu:
                1.Log In
                0.Exit
                """);
        return ScanUtil.intScan("Choose: ");
    }
}
