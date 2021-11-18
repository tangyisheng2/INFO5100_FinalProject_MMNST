module com.nullpointerexpection.info5100_finalproject_mmnst {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires javafx.graphics;

    opens com.nullpointerexpection.info5100_finalproject_mmnst to javafx.fxml;
    exports com.nullpointerexpection.info5100_finalproject_mmnst;
}