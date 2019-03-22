package design_pattern.jtee.intercepting_filter_pattern.client;

import design_pattern.jtee.intercepting_filter_pattern.filter.FilterManager;

public class Client {
    FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager){
        this.filterManager = filterManager;
    }

    public void sendRequest(String request){
        filterManager.filterRequest(request);
    }
}
