package com.HackWizards.WasteManagement.controller;

import com.HackWizards.WasteManagement.model.Recycle;
import com.HackWizards.WasteManagement.service.RecycleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


@RestController
@CrossOrigin(origins = "http://127.0.0.1:5501/html-folder/recycle.html")
public class recycleRequest
{
    @Autowired
    RecycleService RecycleService;

    @PostMapping("/recycle")
    public ResponseEntity<?> addProduct(@RequestPart Recycle recycle, @RequestPart MultipartFile imageFile)
    {
        try {
            System.out.println("Received recycle: " + recycle);
            System.out.println("Received image: " + imageFile.getOriginalFilename());
            Recycle recycle1 = RecycleService.addProduct(recycle, imageFile);
            return new ResponseEntity<>(recycle1, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);


        }
    }
}

