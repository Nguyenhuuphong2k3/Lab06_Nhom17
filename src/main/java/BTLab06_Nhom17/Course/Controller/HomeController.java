package BTLab06_Nhom17.Course.Controller;

import BTLab06_Nhom17.Course.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/test")
    public String test() {
        return "home";
    }

    @GetMapping("")
    public String index(Model model) {
        model.addAttribute("listCourse", courseService.getAllCourses());
        return "home";
    }
}
