package com.example.demo.rep;

import com.example.demo.model.Agent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AgentRep extends JpaRepository<Agent, String> {

    //public Optional<Agent> findAgentByMatricule(String matricule);


}
