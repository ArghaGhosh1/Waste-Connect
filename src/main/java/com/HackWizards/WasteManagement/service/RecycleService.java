package com.HackWizards.WasteManagement.service;

import com.HackWizards.WasteManagement.model.Recycle;
import com.HackWizards.WasteManagement.repo.recyycleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;


@Service
public class RecycleService
{
    @Autowired
    private recyycleRepo repo;
    public Recycle addProduct(Recycle recycle, MultipartFile imageFile) throws IOException {
        recycle.setImageName(imageFile.getOriginalFilename());
        recycle.setImageType(imageFile.getContentType());
        recycle.setImageData(imageFile.getBytes());

        return repo.save(recycle);

    }
}
