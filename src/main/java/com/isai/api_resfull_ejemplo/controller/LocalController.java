package com.isai.api_resfull_ejemplo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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

    @PostMapping("/createLocal")
    public Local saveLocal(@RequestBody Local local) {
        return serviceImp.saveLocal(local);
    }

    @PutMapping("/updateLocal/{localID}")
    public Local updateLocal(@PathVariable Long localID,
            @RequestBody Local local) {
        return serviceImp.updateLocal(localID, local);
    }

}
