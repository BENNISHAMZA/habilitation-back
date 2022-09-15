package com.example.demo.service;

import com.example.demo.model.Agent;
import com.example.demo.rep.AgentRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AgentServiceimpl implements AgentService {
    @Autowired
    private AgentRep agentRep;
    @Override
    public Agent createAgent(Agent agent) {
        // todo check if matricul already exist
        // use exist By ID
        return agentRep.save(agent);
    }

    @Override
    public List<Agent> getAllAgent() {
        return (List<Agent>) agentRep.findAll();
    }

    @Override
    public String deleteAgentById(String matricule) {
        agentRep.deleteById(matricule);
        return matricule;
    }

    @Override
    public Agent UpdateAgentById( Agent agent) {
        agentRep.save(agent);
        return agent;
    }

    @Override
    public Agent getAgent(String matricule) {
        return agentRep.findById(matricule).get();
    }
}
