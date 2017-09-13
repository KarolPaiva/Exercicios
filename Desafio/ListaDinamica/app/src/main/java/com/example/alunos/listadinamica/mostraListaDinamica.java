package com.example.alunos.listadinamica;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.alunos.listadinamica.model.Pessoa;
import com.example.alunos.listadinamica.model.adapter.PessoaAdapter;

import java.util.ArrayList;

public class mostraListaDinamica extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_mostra_lista_dinamica);

//        ListView listview = (ListView) findViewById(R.id.listview);

        ArrayList<Pessoa> lista = new ArrayList<Pessoa>();

        Intent it = getIntent();
        ArrayList array = it.getParcelableArrayListExtra("vetor");


        setListAdapter(new PessoaAdapter(this, array));
    }
}
