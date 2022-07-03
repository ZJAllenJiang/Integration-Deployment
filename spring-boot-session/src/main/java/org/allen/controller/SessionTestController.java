package org.allen.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@RestController
public class SessionTestController
{
    private static final Logger LOGGER = LoggerFactory.getLogger(SessionTestController.class);

    @GetMapping("/hello")
    public String hello()
    {
        return "hello!";
    }

    @GetMapping("/login")
    public String login(final HttpSession session)
    {
        LOGGER.info("logged with session id:{}", session.getId());
        return "logged with session id: " + session.getId();
    }

    @GetMapping("/logout")
    public void logout(final HttpServletResponse response, final HttpSession session) throws IOException
    {
        LOGGER.info("Logout with session id:{}", session.getId());
        session.invalidate();
        response.sendRedirect("/login");
    }
}