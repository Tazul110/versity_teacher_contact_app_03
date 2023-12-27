package com.example.demo.sms.Repository;
import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.example.demo.sms.Model.Teacher;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher,String>{


	public List<Teacher> findBytName(String name);
	public List<Teacher> findBytDept(String dept);
	public List<Teacher> findBytNameStartingWith(String prefix);
	public List<Teacher> findBytNameContainingIgnoreCase(String term);
	

	
}
