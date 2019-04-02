package MVC.Controller;

import MVC.Service.UserService;
import entity.User;

public class UserController {
    private UserService userService;

    public User getUserById(int id) {
        return userService.getUserById(id);
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
