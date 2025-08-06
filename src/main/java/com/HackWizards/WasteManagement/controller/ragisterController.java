package com.HackWizards.WasteManagement.controller;

import com.HackWizards.WasteManagement.model.Ragister;
import com.HackWizards.WasteManagement.service.RagisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "http://127.0.0.1:5501/html-folder/login.html")
@RestController()
public class ragisterController
{

    @Autowired
    RagisterService ragisterService;

    @PostMapping("/ragister")
    public void addragister(@RequestBody Ragister ragi) {
        ragisterService.addRagister(ragi);
    }
}

