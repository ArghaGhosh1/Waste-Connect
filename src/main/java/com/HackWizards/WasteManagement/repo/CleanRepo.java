package com.HackWizards.WasteManagement.repo;

import com.HackWizards.WasteManagement.model.Clean;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CleanRepo extends JpaRepository<Clean, String> {
}
