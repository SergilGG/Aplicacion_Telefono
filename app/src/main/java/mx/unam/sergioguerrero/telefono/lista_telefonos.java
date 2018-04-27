package mx.unam.sergioguerrero.telefono;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class lista_telefonos extends AppCompatActivity {

    ListView LstvTelefonos;
    String[] arraytelefonos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_telefonos);

        LstvTelefonos = (ListView) findViewById(R.id.lstnumeros_telefonicos);
        arraytelefonos = getResources().getStringArray(R.array.Agenda);
        LstvTelefonos.setOnItemClickListener(ItemListener());

        ArrayAdapter<String> AdapterTelefonos = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, arraytelefonos);
        LstvTelefonos.setAdapter(AdapterTelefonos);
    }

    protected AdapterView.OnItemClickListener ItemListener() {
        return new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent instentllamar = new Intent(Intent.ACTION_CALL, Uri.parse(arraytelefonos[position].toString()));

            }
        };
    }
}