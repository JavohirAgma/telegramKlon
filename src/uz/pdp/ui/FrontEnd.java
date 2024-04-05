package uz.pdp.ui;

import uz.pdp.backend.model.user.User;
import uz.pdp.backend.service.chatService.ChatService;
import uz.pdp.backend.service.chatService.ChatServiceImpl;
import uz.pdp.backend.service.userService.UserService;
import uz.pdp.backend.service.userService.UserServiceImpl;
import uz.pdp.ui.views.LoginView;
import uz.pdp.ui.views.UserView;

public class FrontEnd {


    static UserService userService = UserServiceImpl.getInstance();
    static ChatService chatService = ChatServiceImpl.getInstance();

    public static User curUser;

    public static void main(String[] args) {
        System.out.println("Welcome to Telegram Clone  // It's my first big project🙃🙃🙃");
        while (true){
            Integer menu = LoginView.menu();
            switch (menu){
                case 1-> {
                    curUser = LoginView.logIn();
                    if (curUser!=null){
                        UserView.profile();
                    }else {
                        System.out.println("Something wrong❌❌❌");
                    }
                }
                case 2->{
                    System.out.println("Bye Bye");
                    return;
                }
            }
        }
    }
}
