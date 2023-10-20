package com.geekster.restaurant_Mangement.service;

import com.geekster.restaurant_Mangement.Repo.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    IUserRepo iUserRepo;
}
