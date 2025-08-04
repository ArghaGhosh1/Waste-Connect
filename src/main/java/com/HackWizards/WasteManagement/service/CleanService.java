package com.HackWizards.WasteManagement.service;

import com.HackWizards.WasteManagement.model.Clean;
import com.HackWizards.WasteManagement.repo.CleanRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class CleanService
{

    @Autowired
    private CleanRepo repo;
    public Clean addProduct(Clean clean, MultipartFile imageFile) throws IOException {
        clean.setImageName(imageFile.getOriginalFilename());
        clean.setImageType(imageFile.getContentType());
        clean.setImageData(imageFile.getBytes());

        return repo.save(clean);
    }
}
