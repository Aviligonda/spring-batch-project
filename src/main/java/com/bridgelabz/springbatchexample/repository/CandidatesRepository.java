package com.bridgelabz.springbatchexample.repository;

import com.bridgelabz.springbatchexample.entity.Candidates;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidatesRepository extends JpaRepository<Candidates,Long> {
}
