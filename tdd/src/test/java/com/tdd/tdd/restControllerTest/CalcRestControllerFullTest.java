package com.tdd.tdd.restControllerTest;

import com.tdd.tdd.restController.CalcRestController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(CalcRestController.class)
public class CalcRestControllerFullTest {


    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testRestMethod()throws Exception {
        mockMvc.perform(get("/echo/hello"))
                .andExpect(status().isOk());
    }
}