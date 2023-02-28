package dan.salome.proyecton320feb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import javax.xml.transform.Result;

public class MainActivity2 extends AppCompatActivity {

    TextView Dato11;
    TextView Dato22;
    TextView Resultt;
    Button Solution;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Dato11 = findViewById(R.id.DatoUno_Pantalla2);
        Dato22= findViewById(R.id.DatoDos_Pantalla2);
        Resultt = findViewById(R.id.Resultado_Pantalla2);

        String DatoUno = getIntent().getStringExtra("Dato11");
        String DatoDos = getIntent().getStringExtra("Dato22");
        String Resultado = getIntent().getStringExtra("Resultt");

        publicarDatos(DatoUno);
        publicarDatos2(DatoDos);
        publicarDatosResult(Resultado);
    }

    public void publicarDatos(String DatoUno){

        Dato11.setText(DatoUno);
    }

    public void publicarDatos2(String DatoDos){

        Dato22.setText(DatoDos);
    }

    public void publicarDatosResult(String Solucion){

        Resultt.setText("El resultado es: "+Solucion);

    }
}