package com.example.listas;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;

import com.example.listas.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    //definir el objeto binding
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //inicializar binding
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        //setContentView(R.layout.activity_main);
        setContentView(binding.getRoot());
        //usar las vistas diseñadas
        usarvistas();

    }

    private void usarvistas() {

        binding.btnCalcular.setOnClickListener(view -> {
            int numero1= Integer.parseInt(binding.etnumero1.getText().toString());
            int numero2= Integer.parseInt(binding.etNumber2.getText().toString());
            int resultado = numero1+numero2;
            binding.txtResultado.setText(resultado+"");
        });
    }
}
//el boton oculta la imagen y muesta un mensaje estoy probando databine