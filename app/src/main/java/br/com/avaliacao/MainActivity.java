package br.com.avaliacao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

              private EditText editPreçoAlcool;
            private EditText editPreçoGasolina;
            private TextView textResultado;

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);

                editPreçoAlcool = findViewById(R.id.editAlcool);
                editPreçoGasolina = findViewById(R.id.editGasolina);
                textResultado = findViewById(R.id.textResultado);
            }
            public void calcularPreço(View View){
                Double preçoAlcool = Double.parseDouble(editPreçoAlcool.getText().toString());
                Double preçoGasolina = Double.parseDouble(editPreçoGasolina.getText().toString());

              /* Faz calculo (PreçoAlcool/ PreçoGasolina)
                Se resultado >= 0.7 melhor utilizar gasolina
                senão melhor utilizar alcool
               */
            {
                Double Resultado = preçoAlcool / preçoGasolina;
                if (Resultado >= 0.7)
                textResultado.setText("Melhor utilizar gasolina");
            else

              textResultado.setText("melhor utilizar alcool");
        }
    }
}
