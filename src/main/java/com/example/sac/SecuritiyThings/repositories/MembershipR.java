package com.example.sac.SecuritiyThings.repositories;

import com.example.sac.SecuritiyThings.entities.Membership;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MembershipR extends JpaRepository<Membership, String> {

    // LocalDate findJoinedDateByUserId(String userId); // TODO 이건 안되나...
}
