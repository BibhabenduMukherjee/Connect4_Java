module com.sb.connectfour {
	requires javafx.controls;
	requires javafx.fxml;


	opens com.sb.connectfour to javafx.fxml;
	exports com.sb.connectfour;
}