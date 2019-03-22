package design_pattern.jtee.intercepting_filter_pattern.filter;

import design_pattern.jtee.intercepting_filter_pattern.interf.Filter;

public class AuthenticationFilter implements Filter {
    public void execute(String request){
        System.out.println("Authenticating request: " + request);
    }
}
