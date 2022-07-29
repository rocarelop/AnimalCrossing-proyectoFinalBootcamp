package com.ironhack.backAnimalCrossing.controller.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ironhack.backAnimalCrossing.Repository.BugCatchedRepository;
import com.ironhack.backAnimalCrossing.Repository.IslandLeaderRepository;
import com.ironhack.backAnimalCrossing.model.BugCatched;
import com.ironhack.backAnimalCrossing.model.IslandLeader;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
class IslandLeaderControllerImplTest {

    @Autowired
    private IslandLeaderRepository islandLeaderRepository;
    @Autowired
    private WebApplicationContext webApplicationContext;

    private MockMvc mockMvc;

    private final ObjectMapper objectMapper = new ObjectMapper();


    private IslandLeader islandLeader1, islandLeader2;


    @BeforeEach
    void setUp() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();

        islandLeader1= new IslandLeader( "Pablo", "leer", "photo");
        islandLeader1= new IslandLeader( "Carlos", "jugar", "photo");

        islandLeaderRepository.save(islandLeader1);
        islandLeaderRepository.save(islandLeader2);
    }


    @AfterEach
    void tearDown() {
        islandLeaderRepository.deleteAll();
    }


    @Test
    void getAllIslandLeaders() throws Exception {
        MvcResult mvcResult = mockMvc.perform(get("/island-leaders"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andReturn();

        assertFalse(mvcResult.getResponse().getContentAsString().contains("paco"));
    }


    @Test
    void getIslandLeaderById() throws Exception {
        MvcResult mvcResult = mockMvc.perform(get("/island-leaders/"+islandLeader1.getId()))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andReturn();

        assertFalse(mvcResult.getResponse().getContentAsString().contains("paco"));
    }



    @Test
    void deleteIslandLeader() throws Exception {
        MvcResult mvcResult = mockMvc.perform(delete("/island-leaders/" + islandLeader1.getId()))
                .andExpect(status().isNoContent())
                .andReturn();
        assertFalse(islandLeaderRepository.existsById(islandLeader1.getId()));
    }









    @Test
    void createIslandLeader() {
    }

}