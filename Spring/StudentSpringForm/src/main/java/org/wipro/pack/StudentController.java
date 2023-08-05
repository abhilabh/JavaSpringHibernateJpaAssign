package org.wipro.pack;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/student")
public class StudentController {

    @GetMapping("/form")
    public String showForm(Model model) {
        model.addAttribute("student", new Student());
        return "student-form";
    }

    @PostMapping("/form")
    public String processForm(@RequestParam("studentId") int studentId,
                              @RequestParam("studentName") String studentName,
                              @RequestParam("scienceMarks") double scienceMarks,
                              @RequestParam("mathMarks") double mathMarks,
                              Model model) {
        double totalMarks = scienceMarks + mathMarks;
        double averageMarks = totalMarks / 2;

        Student student = new Student();
        student.setStudentId(studentId);
        student.setStudentName(studentName);
        student.setScienceMarks(scienceMarks);
        student.setMathMarks(mathMarks);
        student.setTotalMarks(totalMarks);
        student.setAverageMarks(averageMarks);

        model.addAttribute("student", student);
        return "student-result";
    }
}

