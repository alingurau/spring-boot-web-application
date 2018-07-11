package com.fortech.license;

import com.fortech.BootApplication;
import com.fortech.LicenseDto;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;

import java.awt.*;
import java.nio.charset.Charset;
import java.util.ArrayList;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BootApplication.class)
@WebAppConfiguration
public class LicenseControllerTest {

    private final MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),MediaType.APPLICATION_JSON.getSubtype(), Charset.forName("utf8"));

    private MockMvc mockMvc;

    private HttpMessageConvertor  mappingJackson2HttpMessageConverter;

    private final List<LicenseDto> licenses=new ArrayList<>();

    @Autowired
    private WebApplicationConfiguration webApplicationContext;



}
