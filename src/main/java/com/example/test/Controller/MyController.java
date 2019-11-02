package com.example.test.Controller;

import com.example.test.DTO.StudentDTO;
import com.example.test.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/mycontroller")
public class MyController {

    @Autowired
    StudentService ss;

   // String data=  "";

    @GetMapping("/")
    public List<StudentDTO> hello(){
        return ss.getStudent();
    }

    @PostMapping("/")
    public String helloPost(@RequestBody StudentDTO student)
    {
        return ss.postStudent(student);
    }

    @PutMapping("/{id}")
    public  String helloput(@PathVariable("id") Long id,@RequestBody StudentDTO studentDTO){

        return  ss.updateStudent(id,studentDTO );
    }

    @DeleteMapping("/{id}")
    public String helloDelete(@PathVariable("id") Long id)
    {
        return ss.deleteStudent(id);
    }





}
