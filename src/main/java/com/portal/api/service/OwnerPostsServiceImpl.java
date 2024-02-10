package VenteDeVoiture.src.main.java.com.portal.api.service;

import VenteDeVoiture.src.main.java.com.portal.api.client.CarPostStoreClient;
import VenteDeVoiture.src.main.java.com.portal.api.dto.OwnerPostDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OwnerPostsServiceImpl implements OwnerPostsService {

    @Autowired
    private CarPostStoreClient carPostStoreClient;
    @Override
    public void createOwnerCar(OwnerPostDTO ownerPostDTO){
        carPostStoreClient.ownerPostsClient(ownerPostDTO);
    }
}
