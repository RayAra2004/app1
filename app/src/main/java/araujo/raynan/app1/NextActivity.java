package araujo.raynan.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        //Captura o intent passado da tela activity_main
        Intent i = getIntent();
        //Captura o texto com a chave 'Texto' do intent
        String textoDigitado = i.getStringExtra("Texto");
        //CAptura o TextView
        TextView tvTexto = findViewById(R.id.tvTexto);
        //Seta o conteúdo de 'textoDigitado' no TextView
        tvTexto.setText(textoDigitado);
    }
}