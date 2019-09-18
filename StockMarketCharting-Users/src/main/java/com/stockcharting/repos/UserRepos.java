package com.stockcharting.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stockcharting.entities.User;


@Repository("userRepos")
public interface UserRepos extends JpaRepository<User,Integer>{

}
