package com.HackWizards.WasteManagement.controller;

import com.HackWizards.WasteManagement.model.Farm;
import com.HackWizards.WasteManagement.service.farmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "http://127.0.0.1:5501/html-folder/farm.html")
@RestController()
public class farmController
{

    @Autowired
    farmService farmService;

    @PostMapping("/farm")
    public void addfarm(@RequestBody Farm far) {
        farmService.addfarm(far);
    }
}

