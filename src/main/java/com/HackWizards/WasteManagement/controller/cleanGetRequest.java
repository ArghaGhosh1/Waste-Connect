//package com.HackWizards.WasteManagement.controller;
//
//import com.HackWizards.WasteManagement.model.Clean;
//import com.HackWizards.WasteManagement.service.cleanGetService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping()
//@CrossOrigin
//public class cleanGetRequest {
//
//    @Autowired
//    private cleanGetService service;
//
//
//    @GetMapping("/getClean")
//    public ResponseEntity<List<Clean>> getAllProducts() {
//
//        return new ResponseEntity<>(service.  getAllProducts(), HttpStatus.OK);
//    }
//
//    @GetMapping("/product/{id}")
//    public ResponseEntity<Clean> getProduct(@PathVariable int id) {
//        Clean clean = service.getProduct(id);
//        if (clean != null) {
//            return new ResponseEntity<>(clean, HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }
//
//
//
//
//    @GetMapping("/product/{productId}/image")
//    public ResponseEntity<byte[]> getImageByProductId(@PathVariable int productId) {
//        Clean clean = service.getProduct(productId);
//        byte[] imageFile = clean.getImageData();
//
//        return ResponseEntity.ok().contentType(MediaType.valueOf(clean.getImageType())).body(imageFile);
//
//    }
//
//
//}