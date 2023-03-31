package br.com.etecia.myapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.appbar.MaterialToolbar;

public class MainActivity extends AppCompatActivity {

    MaterialToolbar idToolBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //criando clique de navegação
        idToolBar = findViewById(R.id.idToolBar);

        idToolBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Cliquei no menu Hamburguer", Toast.LENGTH_SHORT).show();
                ;
            }
        });
        // criando clique nos itens de menu

        idToolBar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.mFavorito:
                        Toast.makeText(getApplicationContext(), "Cliquei no favorito", Toast.LENGTH_SHORT).show();
                        ;
                        break;
                    case R.id.mBusca:
                        Toast.makeText(getApplicationContext(), "Barra de pesquisa", Toast.LENGTH_SHORT).show();
                        ;
                        break;
                    case R.id.mShare:
                        Toast.makeText(getApplicationContext(), "Cliquei no compartilhar", Toast.LENGTH_SHORT).show();

                        break;
                    case R.id.mSalvar:
                        Toast.makeText(getApplicationContext(), "Salvei ", Toast.LENGTH_SHORT).show();
                        ;
                        break;
                    case R.id.mSair:
                        Toast.makeText(getApplicationContext(), "fui", Toast.LENGTH_SHORT).show();
                        ;
                        break;
                }
                return false;
            }
        });






    }
}