package sk47kt.servlet.web.frontcontroller.v1;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServlet;

import java.io.IOException;

public interface ControllerV1 {

    void process(ServletRequest request, ServletResponse response) throws ServletException, IOException;

}
