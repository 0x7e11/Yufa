module com.example.demo1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.Yufa to javafx.fxml;
    exports com.example.Yufa;
}