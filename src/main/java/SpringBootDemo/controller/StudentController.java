package SpringBootDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import SpringBootDemo.ServiceIn.StudentServiceIn;
import SpringBootDemo.model.Student;

@RestController
@RequestMapping("/api")
public class StudentController {
@Autowired
private StudentServiceIn savedata;

@PostMapping("/save")
public Student save(@RequestBody Student save) {
return savedata.saveData(save);
	
}
@GetMapping("/getAll")
public List<Student> getAll(){
	return savedata.gatAll();
	
}
@GetMapping("/get/{id}")
public Student findById(@PathVariable Integer id) {	
return savedata.getById(id);
}
@PutMapping("/updte/{id}")
public Student Update(@PathVariable Integer id,@RequestBody Student newstude) {
	return savedata.Update(id, newstude);
	
}
@DeleteMapping("/delete/{id}")
public void delete(@PathVariable Integer id) {
	savedata.delete(id);
	
}
}

