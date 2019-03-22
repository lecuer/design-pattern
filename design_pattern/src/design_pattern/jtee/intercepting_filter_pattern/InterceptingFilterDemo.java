package design_pattern.jtee.intercepting_filter_pattern;


import design_pattern.jtee.intercepting_filter_pattern.client.Client;
import design_pattern.jtee.intercepting_filter_pattern.filter.AuthenticationFilter;
import design_pattern.jtee.intercepting_filter_pattern.filter.DebugFilter;
import design_pattern.jtee.intercepting_filter_pattern.filter.FilterManager;
import design_pattern.jtee.intercepting_filter_pattern.filter.Target;

public class InterceptingFilterDemo {
    public static void main(String[] args) {
        FilterManager filterManager = new FilterManager(new Target());
        filterManager.setFilter(new AuthenticationFilter());
        filterManager.setFilter(new DebugFilter());

        Client client = new Client();
        client.setFilterManager(filterManager);
        client.sendRequest("HOME");
    }
}