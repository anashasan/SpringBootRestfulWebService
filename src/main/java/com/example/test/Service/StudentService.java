package com.example.test.Service;

import com.example.test.DTO.StudentDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    List<StudentDTO> stdList = new ArrayList<>();
    public String postStudent(StudentDTO studentDTO){
//         stdList = new ArrayList<>();
        stdList.add(studentDTO);
       return "Added Successfully";

    }

    public List<StudentDTO> getStudent(){
        return stdList ;

    }
    public String deleteStudent(Long id){
        for (StudentDTO studentDTO: stdList ){
            if(studentDTO.getId() == id)

            {
                stdList.remove(studentDTO);
            }

            }
               return "Deleted Successfully";
            }


            public String updateStudent(Long id, StudentDTO studentDTO){
                for (StudentDTO studentDto: stdList) {
                    if(studentDto.getId()== id){
                        Integer index = stdList.indexOf(studentDto) ;
                        studentDto.setName(studentDTO.getName());
                        studentDto.setAge(studentDTO.getAge());
                        stdList.set(index,studentDto);
                    }
                }
                return "Updated Successfully";
            }
        }


