package com.h3b.investment.gateway.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.h3b.investment.gateway.bean.auth.JwtToken;

@Repository
public interface JwtTokenRepository extends MongoRepository<JwtToken, String> {
}