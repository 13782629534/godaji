package com.woniu.godaji.controller;
import com.woniu.godaji.pojo.BtcSysWarespec;
import com.woniu.godaji.service.IBTC_sys_wareSpec;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.UUID;

@Controller
public class UserInfoController {

    //测试

    @Resource
    private IBTC_sys_wareSpec ibtc_sys_wareSpec;

    @GetMapping("/golist")
    public String goSave(ModelMap map, HttpSession session){
        String token = UUID.randomUUID().toString();//生成一个令牌
        map.put("token",token);
        session.setAttribute("token",token);
        return "index";

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

    @RequestMapping("/select")
    public String select(HttpSession session){
        System.out.println(ibtc_sys_wareSpec.selectBtcSysWarespec());
        List<BtcSysWarespec> list =ibtc_sys_wareSpec.selectBtcSysWarespec();
        session.setAttribute("list",list);
        System.out.println("djshdjshfdshfjhsdfs");
       return "goodsList";
    }

}
