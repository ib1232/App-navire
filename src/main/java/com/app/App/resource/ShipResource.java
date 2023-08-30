package com.app.App.resource;

import com.app.App.model.Ship;
import com.app.App.service.ShipService;
import jakarta.transaction.Transactional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Transactional
@RequestMapping("/ship")
public class ShipResource {
    private final ShipService shipService;


    public ShipResource(ShipService shipService) {
        this.shipService = shipService;

    }
    @GetMapping("/all")
    public ResponseEntity<List<Ship>> getAllShips(){
         List<Ship> ships = shipService.findAllShips();
         return new ResponseEntity<>(ships, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Ship> getShipById(@PathVariable("id") Long id){
        Ship ship = shipService.findShipById(id);
        return new ResponseEntity<>(ship, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Ship> addShip(@RequestBody Ship ship) {
        Ship newship = shipService.addShip(ship);
        return new ResponseEntity<>(newship, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Ship> updateShip(@RequestBody Ship ship) {
        Ship updateship = shipService.updateShip(ship);
        return new ResponseEntity<>(updateship, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteShip(@PathVariable("id") Long id) {
        shipService.deleteShip(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
