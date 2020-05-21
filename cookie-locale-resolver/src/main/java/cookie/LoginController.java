package cookie;

import cookie.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

@Controller
public class LoginController {
    @Autowired
    CookieLocaleResolver localeResolver;

    @RequestMapping(value = "/login.html")
    public ModelAndView loginForm(HttpServletRequest request, HttpServletResponse response, @RequestParam String lang) throws Exception {
        //保存locale到session
        if (lang != null) {
            Locale locale;
            switch (lang) {
                case "zh_CN":
                    locale = Locale.CHINA;
                    break;
                case "en_US":
                    locale = Locale.US;
                    break;
                default:
                    locale = Locale.getDefault();
                    break;
            }
            if (locale != null)
                localeResolver.setLocale(request, response, locale);
        }

        ModelAndView mv = new ModelAndView();
        mv.addObject("message", "Hello World!");
        mv.setViewName("/WEB-INF/content/login.jsp");
        return mv;
    }

    @RequestMapping(value = "/login")
    public ModelAndView login(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mv = new ModelAndView();
        mv.addObject("user", new User("nero", "123456"));
        mv.setViewName("/WEB-INF/content/welcome.jsp");
        return mv;
    }
}
