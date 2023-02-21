package dan.salome.proyecton320feb;

import androidx.appcompat.app.AppCompatActivity;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"Estoy en OnCreate");
        Dato1 =findViewById(R.id.Dato1);
        Dato2 =findViewById(R.id.Dato2);
        Result =findViewById(R.id.Result);
        Calcular =findViewById(R.id.Calcular);

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
}