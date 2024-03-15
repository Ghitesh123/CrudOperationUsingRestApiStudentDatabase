package com.demo.studserviceimpl;

import java.util.List;

import com.demo.entity.Student;

public interface StudentSer {

     Student saveStudent(Student std);
	
     Student getSudent(int id);
     
     List<Student> getAllStudent();
     
     void deleteStudent(int id);
     
     Student updateStudent(Student s,int id);
	
}
