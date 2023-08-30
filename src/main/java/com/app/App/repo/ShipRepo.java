package com.app.App.repo;

import com.app.App.model.Ship;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ShipRepo extends JpaRepository<Ship,Long> {

    @Transactional
    void deleteShipById(Long id);

    Optional<Ship> findShipById(Long id);
}
