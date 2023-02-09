package JWT.filters;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.net.http.HttpResponse;

public class AuthenticationFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
    throws IOException, ServletException {
            System.out.println("start filter");
            HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
            String auth = httpServletRequest.getHeader("Authorization");
            System.out.println(auth);

            filterChain.doFilter(httpServletRequest, servletResponse);
            System.out.println("filter end");
        }
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
    HttpServletRequest httpServletRequest = (HttpServletRequest) requst;
    HttpResponse httpResponse = HttpResponse;

    String auth = httpServletRequest.getHeader("Authorization");
    
}
