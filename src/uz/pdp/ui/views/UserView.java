package uz.pdp.ui.views;

import uz.pdp.ui.utils.ScanUtil;

public class UserView {

    public static void profile(){
        System.out.println("Welcome to user profile");
        while (true){
            Integer menu = menu();
            switch (menu){
                case 1->{
                    Chatting();
                }
                case 2->{
                    ProfileView.profile();
                }
                case 0->{
                    System.out.println("Bye 😢😢😢");
                    return;
                }
            }
        }
    }

    private static void Chatting() {

    }

    private static Integer menu() {
        System.out.println("""
                Menu:
                1.Chat
                2.Show Profile
                0.Log Out
                """);
        return ScanUtil.intScan("Choose: ");
    }
}
