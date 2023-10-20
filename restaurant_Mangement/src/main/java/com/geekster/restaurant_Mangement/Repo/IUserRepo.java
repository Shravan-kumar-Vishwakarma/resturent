package com.geekster.restaurant_Mangement.Repo;

import com.geekster.restaurant_Mangement.Model.Admin;
import com.geekster.restaurant_Mangement.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends JpaRepository<Admin,Integer> {

}
