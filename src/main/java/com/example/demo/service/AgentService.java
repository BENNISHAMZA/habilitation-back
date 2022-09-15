package com.example.demo.service;

import com.example.demo.model.Agent;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

public interface AgentService {

    public Agent createAgent(Agent agent);

    public List<Agent> getAllAgent();

    String deleteAgentById(String matricule);
    public Agent UpdateAgentById( Agent agent);

    public Agent getAgent(String matricule);
}
