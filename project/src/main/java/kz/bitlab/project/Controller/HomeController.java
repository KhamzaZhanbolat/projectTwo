package kz.bitlab.project.Controller;

import kz.bitlab.project.Model.Student;
import kz.bitlab.project.Service.Database;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @GetMapping(value = "/home")
    public String homePage() {
        return "home";
    }


    @GetMapping(value = "/showStudents")
    public String showStudentsPage(Model model) {
        model.addAttribute("stu", Database.getStudents());
        return "showStudents";
    }


    @GetMapping(value = "/add-student")
    public String pageAdd() {
        return "add-student";
    }


    @PostMapping(value = "/addstudent")
    public String addStudent(Student student) {
        Database.addStudent(student);
        return "redirect:/showStudents";
    }
}
