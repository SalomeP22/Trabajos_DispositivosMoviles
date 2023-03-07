package dan.salome.proyecton320feb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String TAG = "Depuarcion";
    EditText Dato1, Dato2;
    TextView Result;
    Button Calcular;

    Button abrirgoogle;

    Button llamada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"Estoy en OnCreate");
        Dato1 =findViewById(R.id.Dato1);
        Dato2 =findViewById(R.id.Dato2);
        Result =findViewById(R.id.Result);
        Calcular =findViewById(R.id.Calcular);

        abrirgoogle = findViewById(R.id.google);
        abrirgoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irAGoogle();
            }
        });


        llamada = findViewById(R.id.llamar);
        llamada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numberPhone ="3217026113";
                irALlamada(numberPhone);
            }
        });
    }

    public void irALlamada(String phoneNumber) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + phoneNumber));
        if (intent.resolveActivity(getPackageManager()) !=null){
            startActivity(intent);
        }
    }

    public void irAGoogle(){

        String url ="https://www.google.com.co/";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "Entré a OnStart");
        Calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float DatoUno = Float.parseFloat(Dato1.getText().toString());
                float DatoDos = Float.parseFloat(Dato2.getText().toString());
                float Resultado = DatoUno*DatoDos;
                Result.setText(String.valueOf(Resultado));
                gotoActividad2(view);
            }
        });
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "Entré a onRestart");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "Entré a onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "Entré a onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "Entré a onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "Entré a onDestroy");
    }

    public void gotoActividad2(View view){

        Intent pasarDatos = new Intent(this, MainActivity2.class);
        pasarDatos.putExtra("Dato11", Dato1.getText().toString());
        pasarDatos.putExtra("Dato22", Dato2.getText().toString());
        pasarDatos.putExtra("Resultt", Result.getText().toString());

        startActivity(pasarDatos);
    }
}