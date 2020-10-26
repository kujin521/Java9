package chapter.ch03.sec03;

import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.stage.*;

// From the command line, you can run this program as
// java ch03.sec03.ButtonDemo
// even though it has no main method

public class ButtonDemo extends Application {
   public void start(Stage stage) {
      //定义一个按钮 设置事件监听
      Button cancelButton = new Button("取消");
      cancelButton.setOnAction(new CancelAction());
      //定义一个文字标签 设置文字大小
      Label message = new Label("Hello, JavaFX!");
      message.setFont(new Font(100));
      //定义垂直框 垂直排列
      VBox root = new VBox();
      //添加子内容 按钮 label
      root.getChildren().addAll(cancelButton, message);
      //将root 添加到Scene 场景容器
      Scene scene = new Scene(root);
      stage.setScene(scene);//将容器设置到窗口
      stage.show();//显示窗口
   }
}

class CancelAction implements EventHandler<ActionEvent> {
    public void handle(ActionEvent event) {
        System.out.println("Oh noes!");
    }
}