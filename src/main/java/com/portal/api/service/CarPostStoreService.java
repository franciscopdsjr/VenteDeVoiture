package VenteDeVoiture.src.main.java.com.portal.api.service;

import VenteDeVoiture.src.main.java.com.portal.api.client.CarPostStoreClient;
import VenteDeVoiture.src.main.java.com.portal.api.dto.CarPostDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CarPostStoreService {

    //Busca os carros
    List<CarPostDTO> getCarForSales();

    //Altera
    void changeCarForSale(CarPostDTO carPost, String id);

    //Exclui
    void removeCarForSale(String id);
}
