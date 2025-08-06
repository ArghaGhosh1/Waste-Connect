//package com.HackWizards.WasteManagement.service;
//
//import com.HackWizards.WasteManagement.model.Clean;
//import com.HackWizards.WasteManagement.repo.cleanGetRequest;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.web.multipart.MultipartFile;
//
//import java.io.IOException;
//import java.util.List;
//
//@Service
//public class cleanGetService {
//
//    @Autowired
//    private cleanGetRequest repo;
//
//    public List<Clean> getAllProducts() {
//        return repo.findAll();
//    }
//
//    public Clean getProduct(int id) {
//        return repo.findById(id).orElse(null);
//    }
//
//    public Clean addProduct(Clean clean, MultipartFile imageFile) throws IOException {
//        clean.setImageName(imageFile.getOriginalFilename());
//        clean.setImageType(imageFile.getContentType());
//        clean.setImageData(imageFile.getBytes());
//
//        return repo.save(clean);
//    }
//
//
//}