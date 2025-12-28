package com.srijanmurai;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("software-engineers")
public class SoftwareEngineerController {

    @GetMapping
    public List<SoftwareEngineer> getEngineers(){
        return List.of(
                new SoftwareEngineer(
                        1,
                        "Srijan Murai",
                        "Python, Java, Springboot"
                ),
                new SoftwareEngineer(
                        2,
                        "John Doe",
                        "HTML, CSS"
                )
        );
    }
}