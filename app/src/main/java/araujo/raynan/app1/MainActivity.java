package araujo.raynan.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Capturando o botão de enviar por meio do ID
        Button btnEnviar = findViewById(R.id.btnEnviar);
        //Comando que "escuta" um  click no botão
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            //
            @Override
            public void onClick(View view) {
                //Capturando o editText de enviar por meio do ID
                EditText etDigiteAqui = findViewById(R.id.etDigiteAqui);
                //Captura o texto digitado no editText e o transforma em string
                String textoDigitado = etDigiteAqui.getText().toString();
                etDigiteAqui.setText("");
                //Criando uma intenção para navegar desta janela para a NextActivity
                Intent i = new Intent(MainActivity.this,NextActivity.class);
                //Adiciona no dicionário do intent o conteúdo da variável 'textoDigitado' com a chave 'Texto'
                i.putExtra("Texto", textoDigitado);
                //Executando o intent
                startActivity(i);
            }
        });
    }
}