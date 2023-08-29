package sk47kt.servlet.basic.request;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletInputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.util.StreamUtils;
import sk47kt.servlet.basic.HelloData;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

@WebServlet(name="reqeustBodyJsonServlet",urlPatterns = "/request-body-json")
public class ReqeustBodyJsonServlet extends HttpServlet {

    private ObjectMapper objectMapper = new ObjectMapper();

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletInputStream inputStream = request.getInputStream();
        String messagebody = StreamUtils.copyToString(inputStream, StandardCharsets.UTF_8);

        System.out.println("messagebody = " + messagebody);

        HelloData helloData = objectMapper.readValue(messagebody, HelloData.class); //json 변환

        System.out.println("helloData.username = " + helloData.getUsername());
        System.out.println("helloData.getAge = " + helloData.getAge());
    }
}
