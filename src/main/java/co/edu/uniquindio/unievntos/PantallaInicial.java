package co.edu.uniquindio.unievntos;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class PantallaInicial extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Crear la lista de eventos aleatorios (solo para propósitos de demostración)
        VBox eventosAleatorios = new VBox(10);
        for (int i = 0; i < 5; i++) {
            eventosAleatorios.getChildren().add(crearEventoAleatorio());
        }

        // Botón de Registro/Inicio de Sesión
        Button btnRegistro = new Button("Registro");
        Button btnInicioSesion = new Button("Inicio de Sesión");
        HBox botonesAcceso = new HBox(10);
        botonesAcceso.getChildren().addAll(btnRegistro, btnInicioSesion);

        // Sección de Búsqueda
        Label lblBusqueda = new Label("Buscar Eventos:");
        // Aquí se puede agregar un campo de búsqueda (TextField) y un botón de búsqueda
        VBox seccionBusqueda = new VBox(5, lblBusqueda /*, campoBusqueda, btnBuscar*/);

        // Contenedor principal
        VBox root = new VBox(20);
        root.setPadding(new Insets(20));
        root.getChildren().addAll(eventosAleatorios, botonesAcceso, seccionBusqueda);

        // Configurar la escena y mostrarla en la ventana
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("UniEventos - Pantalla Inicial");
        primaryStage.show();
    }

    // Método para crear un evento aleatorio (solo para propósitos de demostración)
    private VBox crearEventoAleatorio() {
        Label lblNombre = new Label("Concierto en Vivo");
        Label lblCiudad = new Label("Bogotá");
        Label lblFecha = new Label("10 de mayo de 2024");

        VBox evento = new VBox(5);
        evento.getChildren().addAll(lblNombre, lblCiudad, lblFecha);
        evento.setStyle("-fx-border-color: black; -fx-border-width: 1px; -fx-padding: 10px;");
        return evento;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
