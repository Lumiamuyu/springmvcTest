package Lumiamuyu.web;

import Lumiamuyu.pojo.Suser;
import Lumiamuyu.service.ISuserService;
import Lumiamuyu.service.SuserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class WebTest {
    private ISuserService service = new SuserServiceImpl();
    @RequestMapping("/a.do")
    public String a(){
        return "a";
    }

    @RequestMapping("/c.do")
    public String c(Suser suser){
        service.insert(suser);
        return "redirect:b.do";
    }

    @RequestMapping("/b.do")
/*    public String b(@RequestParam("name") String name, ("password")String password){
        System.out.println(name+" "+password);
        return "";*/
    public String b(Model model){
        List<Suser> s = service.getLists();
        model.addAttribute("s",s);
        return "b";
    }

    @RequestMapping("/d.do")
    public String d(int id){
        service.delete(id);
        return "redirect:b.do";
    }

    @RequestMapping("/e.do")
    public String e(int id,Model model){
        Suser suser = service.getOne(id);
        model.addAttribute("suser",suser);
        return "e";
    }

    @RequestMapping("/doe.do")
    public String doe(Suser suser){
        service.update(suser);
        return "redirect:b.do";
    }

}
