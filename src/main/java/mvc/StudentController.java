package mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by vic on 25.11.16.
 */
@Controller
public class StudentController {

    @RequestMapping("/hello")
    public String getStudentList(Model model) {
        model.addAttribute("message", "hello");
        return "stdList";
    }
}
