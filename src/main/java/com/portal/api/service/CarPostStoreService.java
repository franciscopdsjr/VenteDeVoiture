package com.portal.api.service;


import com.portal.api.dto.CarPostDTO;
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
