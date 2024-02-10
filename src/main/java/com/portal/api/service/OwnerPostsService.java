package VenteDeVoiture.src.main.java.com.portal.api.service;

import VenteDeVoiture.src.main.java.com.portal.api.dto.OwnerPostDTO;
import org.springframework.stereotype.Service;

@Service
public interface OwnerPostsService {
    void createOwnerCar(OwnerPostDTO ownerPostDTO);
}
