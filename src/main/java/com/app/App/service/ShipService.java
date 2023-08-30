package com.app.App.service;

import com.app.App.exception.UserNotFoundException;
import com.app.App.model.Ship;
import com.app.App.repo.ShipRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;

@Service
public class ShipService {
    private final ShipRepo shipRepo;


    @Autowired
    public ShipService(ShipRepo shipRepo) {
        this.shipRepo = shipRepo;
    }
    public Ship addShip(Ship ship) {
        return shipRepo.save(ship);
    }

    public List<Ship> findAllShips() {
        return shipRepo.findAll();
    }

    public Ship updateShip(Ship ship) {
        return shipRepo.save(ship);
    }

    public Ship findShipById(Long id){
        return shipRepo.findShipById(id)
                .orElseThrow(()-> new UserNotFoundException("User by id" + id + "was not found"));
    }
    @Transactional
    public void deleteShip (Long id){
        shipRepo.deleteShipById(id);
    }
}
