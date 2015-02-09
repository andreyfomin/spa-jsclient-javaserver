package com.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by johanna on 10/23/2014.
 */
@WebFilter(urlPatterns = {"/*"}, description = "CORS Filter")
public class CorsFilter implements Filter {

    @Override
    public void init(FilterConfig arg0) throws ServletException {}

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp,
                         FilterChain chain) throws IOException, ServletException {
        // TODO Auto-generated method stub
        HttpServletResponse response=(HttpServletResponse) resp;

        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");

        chain.doFilter(req, resp);
    }

    @Override
    public void destroy() {}

}