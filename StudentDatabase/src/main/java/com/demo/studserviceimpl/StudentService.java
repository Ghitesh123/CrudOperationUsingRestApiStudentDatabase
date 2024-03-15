package com.demo.studserviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Student;
import com.demo.repo.StudentRepo;

@Service
public class StudentService implements StudentSer{
	@Autowired
private StudentRepo r;
	@Override
	public Student saveStudent(Student std) {
		Student s1=r.save(std);
		System.out.println(std.getAddress());
		return s1;

	}
	@Override
	public Student getSudent(int id) {
		Optional<Student> s2=r.findById(id);
		Student s=s2.get();
		return s;
		
	}
	@Override
	public List<Student> getAllStudent() {
     List<Student> s1=r.findAll();
		return s1;
	}
	@Override
	public void deleteStudent(int id) {
 r.deleteById(id);
		
	}
	@Override
	public Student updateStudent(Student s, int id) {
	   Optional<Student> s3=r.findById(id);
		Student s4=s3.get();
		
		return r.save(s4);
	}

}
