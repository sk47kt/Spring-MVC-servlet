package sk47kt.servlet.web.frontcontroller.v2;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import sk47kt.servlet.web.frontcontroller.MyView;

import java.io.IOException;

public interface ControllerV2 {
    MyView process(ServletRequest request, ServletResponse response) throws ServletException, IOException;

}
