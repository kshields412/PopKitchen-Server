package com.popkitchen.api.service;

import com.popkitchen.api.model.Kitchen;
import com.popkitchen.api.repository.KitchenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class KitchenService {

    @Autowired
    private KitchenRepository kitchenRepository;

    public ResponseEntity<?> createKitchen(Kitchen kitchen) {
        ResponseEntity<?> response;
        try{
            response = new ResponseEntity<> (kitchenRepository.save(kitchen), HttpStatus.OK);
        } catch(Exception e) {
            response = new ResponseEntity<> ("Cannot create kitchen, please try again.", HttpStatus.BAD_REQUEST);
            e.printStackTrace();
        }
        return response;
    }

    public ResponseEntity<?> deleteKitchen(Kitchen kitchen){
        ResponseEntity<?> response;
        try{
            kitchenRepository.delete(kitchen);
            response = new ResponseEntity<> (HttpStatus.OK);
        } catch (Exception e){
            response = new ResponseEntity<>("Cannot delete kitchen, please try again.", HttpStatus.BAD_REQUEST);
            e.printStackTrace();
        }
        return response;
    }

    public ResponseEntity<?> updateKitchen(Kitchen kitchen){
        ResponseEntity<?> response;
        try{
            response = new ResponseEntity<>(kitchenRepository.save(kitchen), HttpStatus.OK);
        } catch(Exception e) {
            response = new ResponseEntity<>("Cannot update kitchen, please try again.", HttpStatus.BAD_REQUEST);
            e.printStackTrace();
        }
        return response;
    }


    public ResponseEntity<?> getKitchen(Kitchen kitchen) {
        ResponseEntity<?> response;
        try{
            response = new ResponseEntity<>(kitchenRepository.findByKitchenName(kitchen.getKitchenName()), HttpStatus.OK);
        }catch(Exception e){
            response = new ResponseEntity<>("Was good!", HttpStatus.BAD_REQUEST);
            e.printStackTrace();
        }
        return response;
    }
}
