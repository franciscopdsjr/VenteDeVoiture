package VenteDeVoiture.src.main.java.com.portal.api.controller;

import VenteDeVoiture.src.main.java.com.portal.api.dto.OwnerPostDTO;
import VenteDeVoiture.src.main.java.com.portal.api.service.CarPostStoreService;
import VenteDeVoiture.src.main.java.com.portal.api.service.OwnerPostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/owner")
public class OwnerPostController {
    @Autowired
    private OwnerPostsService ownerPostsService;

    @PostMapping
    public ResponseEntity createOwnerCar(@RequestBody OwnerPostDTO ownerPostDTO){
        ownerPostsService.createOwnerCar(ownerPostDTO);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
