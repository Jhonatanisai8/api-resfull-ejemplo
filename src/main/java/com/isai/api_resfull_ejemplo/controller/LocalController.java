package com.isai.api_resfull_ejemplo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.isai.api_resfull_ejemplo.entity.Local;
import com.isai.api_resfull_ejemplo.service.LocalServiceImp;

@RestController
@RequestMapping("/locals")
public class LocalController {

    @Autowired
    LocalServiceImp serviceImp;

    @GetMapping("/findAllLocals")
    public List<Local> getAllLocals() {
        return serviceImp.findAllLocals();
    }

    @GetMapping("/findLocalByNameWithJPQL/{name}")
    public Optional<Local> findLocalByNameWithJPQL(@PathVariable String name) {
        return serviceImp.findLocalByNameWithJPQL(name);
    }

    @GetMapping("/findByName/{name}")
    public Optional<Local> findByName(@PathVariable String name) {
        return serviceImp.findByName(name);
    }

    @GetMapping("/findByNameIgnoreCase/{name}")
    public Optional<Local> findByNameIgnoreCase(@PathVariable String name) {
        return serviceImp.findByNameIgnoreCase(name);
    }

    @PostMapping("/createLocal")
    public Local saveLocal(@RequestBody Local local) {
        return serviceImp.saveLocal(local);
    }

    @PutMapping("/updateLocal/{localID}")
    public Local updateLocal(@PathVariable Long localID,
            @RequestBody Local local) {
        return serviceImp.updateLocal(localID, local);
    }

    @DeleteMapping("/deleteLocal/{localID}")
    public String deleteLocal(@PathVariable Long localID) {
        serviceImp.deleteLocal(localID);
        return "Exists Delete By Id: " + localID;
    }

}
