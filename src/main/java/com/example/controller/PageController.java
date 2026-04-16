package com.example.controller;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

@Controller
public class PageController {

    private static final String ADAPTER_SCRIPT = "    <script src=\"/js/api-adapter.js\"></script>\n";
    private static final String JQUERY_MARKER = "    <script src=\"https://code.jquery.com/";

    @GetMapping("/")
    public String index() {
        return "redirect:/leetcode-tracker";
    }

    @GetMapping("/leetcode-tracker")
    public void tracker(HttpServletResponse response) throws IOException {
        ClassPathResource resource = new ClassPathResource("leetcode-tracker.html");
        InputStream is = resource.getInputStream();
        String html = StreamUtils.copyToString(is, StandardCharsets.UTF_8);
        is.close();

        html = html.replace(JQUERY_MARKER, ADAPTER_SCRIPT + JQUERY_MARKER);

        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().write(html);
    }
}
