package org.example;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component

public class CartService implements InitializingBean {

    Map<Integer,String> mp;

    public CartService(){
        mp = new HashMap<>();
        System.out.println("Cart Service constructor called");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Cart Service afterPropertiesSet called");
     mp.put(1,"sayali");
     mp.put(2,"Divya");
    }

    public void getCart(){

        System.out.println("UserService getCart");
    }

    public String getValue(int key){
        return mp.get(key);
    }
}
