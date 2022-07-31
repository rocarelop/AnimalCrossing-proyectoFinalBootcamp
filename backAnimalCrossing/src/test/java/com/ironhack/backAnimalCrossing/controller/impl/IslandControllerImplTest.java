package com.ironhack.backAnimalCrossing.controller.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ironhack.backAnimalCrossing.Repository.BugCatchedRepository;
import com.ironhack.backAnimalCrossing.Repository.IslandLeaderRepository;
import com.ironhack.backAnimalCrossing.Repository.IslandRepository;
import com.ironhack.backAnimalCrossing.model.BugCatched;
import com.ironhack.backAnimalCrossing.model.Island;
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
class IslandControllerImplTest {
    @Autowired
    private IslandRepository islandRepository;

    @Autowired
    private IslandLeaderRepository islandLeaderRepository;
    @Autowired
    private WebApplicationContext webApplicationContext;

    private MockMvc mockMvc;

    private final ObjectMapper objectMapper = new ObjectMapper();

    private Island island1, island2;
    private IslandLeader islandLeader1, islandLeader2;
    @BeforeEach
    void setUp() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();

        islandLeader1= new IslandLeader( "Pablo", "leer", "photo");
        islandLeader1= new IslandLeader( "Carlos", "jugar", "photo");

       island1 = new Island("Island1");
       island2= new Island("Island2");
       islandLeaderRepository.saveAll(islandLeader1, islandLeader2);
       islandRepository.saveAll(island1, island2);
    }

    @AfterEach
    void tearDown() {
        islandRepository.deleteAll();
        islandLeaderRepository.deleteAll();
    }

    @Test
    void getAllIslands() throws Exception {
        MvcResult mvcResult = mockMvc.perform(get("/islands"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andReturn();

        assertTrue(mvcResult.getResponse().getContentAsString().contains("Island1"));
        assertTrue(mvcResult.getResponse().getContentAsString().contains("Island2"));
        assertFalse(mvcResult.getResponse().getContentAsString().contains("Island3"));
    }

    @Test
    void getIslandById() throws Exception {
        MvcResult mvcResult = mockMvc.perform(get("/islands/"+island1.getId()))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andReturn();

        assertTrue(mvcResult.getResponse().getContentAsString().contains("Island1"));
        assertFalse(mvcResult.getResponse().getContentAsString().contains("Island2"));
    }


    @Test
    void deleteIsland() throws Exception {
        MvcResult mvcResult = mockMvc.perform(delete("/islands/" + island1.getId()))
                .andExpect(status().isNoContent())
                .andReturn();
        assertFalse(islandRepository.existsById(island1.getId()));
    }

    @Test
    void createIsland() {
    }
}