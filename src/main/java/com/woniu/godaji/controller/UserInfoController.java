package com.woniu.godaji.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpSession;
import java.util.UUID;

@Controller
public class UserInfoController {
    @GetMapping("/gosave")
    public String goSave(ModelMap map, HttpSession session){
        String token = UUID.randomUUID().toString();//生成一个令牌
        map.put("token",token);
        session.setAttribute("token",token);
        return "userinfo";
    }

    @RequestMapping("/save")
    public String save(String uname,String pass,String token, HttpSession session){
        Object sessionToken = session.getAttribute("token");
        if(token!=null&&sessionToken!=null&&token.equals(sessionToken.toString())){
            System.out.println("插入数据库"+uname);
            session.removeAttribute("token");
            return "index";
        }
        return "buok";
    }

}
