package com.example.demo.controller;

import com.example.demo.model.Agent;
import com.example.demo.service.AgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/agent")
public class AgentController {
    @Autowired
    private AgentService agentService;

    @PostMapping(value = "/add")
    public String add(@RequestBody Agent agent) {
        agentService.createAgent(agent);
        return "OK";
    }

    @GetMapping("/allagent")
    public List<Agent> getAllAgents() {
        return agentService.getAllAgent();
    }

    @DeleteMapping("/{id}")
    public String deleteAgentById(@PathVariable String id) {
        return agentService.deleteAgentById(id);
    }
    @PutMapping("/{id}")
    public Agent updateAgentById(@RequestBody Agent agent) {
        return agentService.UpdateAgentById(agent);
    }

    @GetMapping("/{id}")
    public Agent getAgent(@PathVariable String id) {
        return agentService.getAgent(id);
    }

}
