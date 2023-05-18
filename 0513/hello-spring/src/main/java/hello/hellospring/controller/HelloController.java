package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @GetMapping("hello")
    public String hello(Model model){
        model.addAttribute("data","hello!!");
        return "hello";
    }
    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam(value="name") String name,Model model){
        model.addAttribute("name",name);
        return "hello-template";
    }
    
    //view없이 문자가 그대로 내려감
    @GetMapping("hello-string")
    @ResponseBody//http의 body부에 이 데이터를 직접 넣엉주겠다
    public String helloString(@RequestParam("name") String name){
        return "hello "+name; //hello spring
    }

    // json방식으로 return해줌
    // 객체를 반환시 json으로 반환해줌
    @GetMapping("hello-api")
    @ResponseBody
    public Hello helloApi(@RequestParam("name") String name){
        Hello hello = new Hello();
        hello.setName(name);
        return hello;
    }
    static class Hello{
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        private String name;

    }
}
