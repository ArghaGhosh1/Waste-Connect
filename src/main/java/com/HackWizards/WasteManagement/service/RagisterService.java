package com.HackWizards.WasteManagement.service;

import com.HackWizards.WasteManagement.model.Ragister;
import com.HackWizards.WasteManagement.repo.RagisterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class RagisterService
{

    @Autowired
    RagisterRepo repo;

    public void addRagister(Ragister ragi)
    {
        repo.save(ragi);
    }
}
