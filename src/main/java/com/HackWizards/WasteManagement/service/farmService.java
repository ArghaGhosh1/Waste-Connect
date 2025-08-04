package com.HackWizards.WasteManagement.service;

import com.HackWizards.WasteManagement.model.Farm;
import com.HackWizards.WasteManagement.repo.farmRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class farmService
{

    @Autowired
    farmRepo repo;

    public void addfarm(Farm far)
    {
        repo.save(far);
    }
}
