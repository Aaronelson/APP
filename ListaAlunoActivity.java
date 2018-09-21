package pacote.agenda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListaAlunoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_aluno);

        String[] alunos = {"Aaron","Daniel","Felipe","Ronaldo","Ana","Pedro","João","Rita","Thalita","Maria","Gabriela","Fernanda","Daisy","Jaqueline"};
        ListView listaAluno = (ListView) findViewById(R.id.lista_alunos);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,alunos);
        listaAluno.setAdapter(adapter);
    }
}
