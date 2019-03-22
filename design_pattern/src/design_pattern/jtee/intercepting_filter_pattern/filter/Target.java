package design_pattern.jtee.intercepting_filter_pattern.filter;

public class Target {
    public void execute(String request){
        System.out.println("Executing request: " + request);
    }
}