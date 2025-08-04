package com.HackWizards.WasteManagement.controller;

import com.HackWizards.WasteManagement.model.Clean;
import com.HackWizards.WasteManagement.service.CleanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5501/html-folder/cleaning.html")
public class cleanRequest {

    @Autowired
    CleanService cleanservice;

    @PostMapping("/clean")
    public ResponseEntity<?> addProduct(@RequestPart Clean clean, @RequestPart MultipartFile imageFile)
    {
        try {
            System.out.println("Received clean: " + clean);
            System.out.println("Received image: " + imageFile.getOriginalFilename());
            Clean clean1 = cleanservice.addProduct(clean, imageFile);
            return new ResponseEntity<>(clean1, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);


        }
        }
        }
