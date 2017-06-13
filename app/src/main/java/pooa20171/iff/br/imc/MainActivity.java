package pooa20171.iff.br.imc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_m = (Button) findViewById(R.id.buttonM);
        btn_m.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                EditText txtN1 = (EditText) findViewById(R.id.txtN1);
                double resultado = (Double.parseDouble( txtN1.getText().toString()) - 100) - ((Double.parseDouble(txtN1.getText().toString()) - 150)/4);

                TextView txvResultado = (TextView) findViewById(R.id.txvResultado);
                txvResultado.setText("IMC = " + String.valueOf(resultado));

                Toast.makeText(getBaseContext(), String.valueOf(resultado), Toast.LENGTH_SHORT).show();

            }
        });

        Button btn_f = (Button) findViewById(R.id.buttonF);
        btn_f.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                EditText txtN1 = (EditText) findViewById(R.id.txtN1);
                double resultado = (Double.parseDouble( txtN1.getText().toString()) - 100) - ((Double.parseDouble(txtN1.getText().toString()) - 150)/2);

                TextView txvResultado = (TextView) findViewById(R.id.txvResultado);
                txvResultado.setText("IMC = " + String.valueOf(resultado));

                Toast.makeText(getBaseContext(), String.valueOf(resultado), Toast.LENGTH_SHORT).show();

            }
        });
    }
}
