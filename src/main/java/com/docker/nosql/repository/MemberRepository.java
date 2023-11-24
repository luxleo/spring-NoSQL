package com.docker.nosql.repository;

import com.docker.nosql.domain.Member;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

public interface MemberRepository extends MongoRepository<Member,String> {

}
