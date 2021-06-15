package addPortal.storage;

import addPortal.model.User;

import java.util.HashMap;
import java.util.Map;


public class UserStorage {

    Map<String, User> users = new HashMap<>();


    public void Add(User user) {


        users.put(user.getPhonNumber(),user);
    }

    public boolean login(String phonNumber, String password){//sxal e.mihst trou e
        if(phonNumber.equals(users.get(phonNumber)) && password.equals(users.get(password))){
            return true;
        }else {
            return false;
        }

    }

    public User getUser(String phonNumber){
       User user = users.get(phonNumber);
        return user;
    }


}
