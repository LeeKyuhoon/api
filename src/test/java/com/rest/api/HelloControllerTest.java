package com.rest.api;

//import org.junit.Test;
import com.rest.api.controller.HelloController;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

//@RunWith(SpringRunner.class)
@WebMvcTest(controllers = HelloController.class)
@Log4j2
class HelloControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void helloworldTest() throws Exception{

        String hello = "helloworld";

        mvc.perform(get("/helloworld/string"))
                .andExpect(status().isOk())
                .andExpect(content().string(hello));

        log.info("helloworld");
    }

}
