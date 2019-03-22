package design_pattern.structural_patterns.proxy_pattern;

import design_pattern.structural_patterns.proxy_pattern.dto.ProxyImage;
import design_pattern.structural_patterns.proxy_pattern.interf.Image;

public class ProxyPatternDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        //图像将从磁盘加载
        image.display();
        System.out.println("");
        //图像将无法从磁盘加载
        image.display();
    }
}