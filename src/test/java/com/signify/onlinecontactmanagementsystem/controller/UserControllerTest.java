package com.signify.onlinecontactmanagementsystem.controller;

import com.signify.onlinecontactmanagementsystem.entity.User;
import com.signify.onlinecontactmanagementsystem.services.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private UserService userService;

    private User user;

    @BeforeEach
    public void setUp() {
        user = new User();
        user.setUserName("John Doe");
        user.setPhoneNumber("1234567890");
        user.setEmail("john.doe@signify.com");
    }

    @Test
    public void testCreateUser() throws Exception {
        mockMvc.perform(post("/api/v1/users")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{ \"userName\": \"John Doe\", \"phoneNumber\": \"1234567890\", \"email\": \"john.doe@signify.com\" }"))
                .andExpect(status().isOk());
    }

}