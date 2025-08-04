package com.HackWizards.WasteManagement.repo;

import com.HackWizards.WasteManagement.model.Farm;
import com.HackWizards.WasteManagement.model.Ragister;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface farmRepo extends JpaRepository<Farm, String> {

}

