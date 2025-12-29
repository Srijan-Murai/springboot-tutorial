package com.srijanmurai;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoftwareEngineerService {
    private SoftwareEngineerRepository sweRep;

    public SoftwareEngineerService(SoftwareEngineerRepository sweRep) {
        this.sweRep = sweRep;
    }

    public List<SoftwareEngineer> getEngineers() {
        return sweRep.findAll();
    }
}
