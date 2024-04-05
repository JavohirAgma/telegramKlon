package uz.pdp.ui.views;

import uz.pdp.backend.service.userService.UserService;
import uz.pdp.backend.service.userService.UserServiceImpl;
import uz.pdp.ui.FrontEnd;
import uz.pdp.ui.utils.ScanUtil;

public class ProfileView {
    static UserService userService = UserServiceImpl.getInstance();
    public static void profile(){
        System.out.println("Welcome to user profile");
        while (true){
            Integer menu = menu();
            switch (menu){

                case 3->{
                    return;
                }
            }
        }
    }

    private static Integer menu(){
        System.out.println("""
                Menu:
                1.Add account
                2.Edit profile
                3.Back
                """);
        return ScanUtil.intScan("Choose: ");
    }
}
