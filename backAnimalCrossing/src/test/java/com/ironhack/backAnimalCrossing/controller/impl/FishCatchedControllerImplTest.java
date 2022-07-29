package com.ironhack.backAnimalCrossing.controller.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ironhack.backAnimalCrossing.Repository.FishCatchedRepository;
import com.ironhack.backAnimalCrossing.Repository.IslandLeaderRepository;

import com.ironhack.backAnimalCrossing.model.BugCatched;
import com.ironhack.backAnimalCrossing.model.FishCatched;
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
class FishCatchedControllerImplTest {

    @Autowired
    private FishCatchedRepository fishCatchedRepository;

    @Autowired
    private IslandLeaderRepository islandLeaderRepository;
    @Autowired
    private WebApplicationContext webApplicationContext;

    private MockMvc mockMvc;

    private final ObjectMapper objectMapper = new ObjectMapper();

    private FishCatched fishCatched1, fishCatched2;
    private IslandLeader islandLeader1, islandLeader2;


    @BeforeEach
    void setUp() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();

        islandLeader1= new IslandLeader( "Pablo", "leer", "photo");
        islandLeader1= new IslandLeader( "Carlos", "jugar", "photo");

        fishCatched1 = new FishCatched("peces");
        fishCatched2 = new FishCatched("pescados");
    }

    @AfterEach
    void tearDown() {
        fishCatchedRepository.deleteAll();
        islandLeaderRepository.deleteAll();
    }

    @Test
    void getAllFishCatched() throws Exception {
        MvcResult mvcResult = mockMvc.perform(get("/fishcatcheds"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andReturn();

        assertFalse(mvcResult.getResponse().getContentAsString().contains("insectos"));
    }

    @Test
    void getFishCatchedById() throws Exception {
        MvcResult mvcResult = mockMvc.perform(get("/fishcatcheds/"+fishCatched1.getId()))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andReturn();

        assertFalse(mvcResult.getResponse().getContentAsString().contains("insectos"));
    }
    @Test
    void deleteFishCatched() throws Exception {
        MvcResult mvcResult = mockMvc.perform(delete("/fishcatcheds/" + fishCatched1.getId()))
                .andExpect(status().isNoContent())
                .andReturn();
        assertFalse(fishCatchedRepository.existsById(fishCatched1.getId()));
    }
    @Test
    void createFishCatched() {
    }


}