package br.com.zup.awesome.endpoint;

import br.com.zup.awesome.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static java.util.Arrays.asList;

@RestController
@RequestMapping("student")
public class StudentEndPoint {

    @GetMapping("/list")
    public List<Student>listAll(){
        return asList(new Student("Márcio"), new Student("Aldilene"));
    }
}
