package design_pattern.behavioral_patterns.template_pattern;

import design_pattern.behavioral_patterns.template_pattern.modle.Cricket;
import design_pattern.behavioral_patterns.template_pattern.modle.Football;
import design_pattern.behavioral_patterns.template_pattern.modle.Game;

public class TemplatePatternDemo {
    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}