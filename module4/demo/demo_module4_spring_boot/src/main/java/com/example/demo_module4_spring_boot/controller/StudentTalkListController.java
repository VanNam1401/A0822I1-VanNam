package com.example.demo_module4_spring_boot.controller;

import com.example.demo_module4_spring_boot.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import java.util.List;

//danh sách các student được add
@Controller
public class StudentTalkListController {
    @GetMapping("/talk")
    public String getTalk(@SessionAttribute("StudentTalkList") List<Student> studentList,
                          Model model) {
        model.addAttribute("studentList", studentList);
        return "talkList";
    }
}
