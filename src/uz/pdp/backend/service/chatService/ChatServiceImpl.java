package uz.pdp.backend.service.chatService;

import uz.pdp.backend.model.chat.Chat;
import uz.pdp.backend.service.userService.UserService;
import uz.pdp.backend.service.userService.UserServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class ChatServiceImpl implements ChatService{

    List<Chat> chatList;

    public ChatServiceImpl() {
        this.chatList = new ArrayList<>();
    }

    @Override
    public boolean create(Chat chat) {
        return false;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public void update(Chat newM) {

    }

    @Override
    public Chat get(String id) {
        return null;
    }

    static ChatService chatService;

    public static ChatService getInstance(){
        if (chatService==null){
            chatService = new ChatServiceImpl();
        }
        return chatService;
    }

}
