package com.portal.api.service;

import com.portal.api.dto.OwnerPostDTO;
import org.springframework.stereotype.Service;

@Service
public interface OwnerPostsService {
    void createOwnerCar(OwnerPostDTO ownerPostDTO);
}
