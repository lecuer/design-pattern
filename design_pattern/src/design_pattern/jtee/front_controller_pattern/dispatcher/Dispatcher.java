package design_pattern.jtee.front_controller_pattern.dispatcher;

import design_pattern.jtee.front_controller_pattern.view.HomeView;
import design_pattern.jtee.front_controller_pattern.view.StudentView;

public class Dispatcher {
    private StudentView studentView;
    private HomeView homeView;
    public Dispatcher(){
        studentView = new StudentView();
        homeView = new HomeView();
    }

    public void dispatch(String request){
        if(request.equalsIgnoreCase("STUDENT")){
            studentView.show();
        }else{
            homeView.show();
        }
    }
}
