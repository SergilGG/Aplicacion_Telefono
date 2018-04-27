package mx.unam.sergioguerrero.telefono;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnAceptar;
    EditText edtUsuario;
    String Usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAceptar =  (Button)findViewById(R.id.btnAceptar);
        btnAceptar.setOnClickListener(OnClickAceptar);
    }

    public View.OnClickListener OnClickAceptar= new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intentdatos = new Intent(getApplicationContext(),lista_telefonos.class);
            //intentdatos.putExtra(getResources().getString(R.string.var_usuario_extra),edtUsuario.getText().toString());
            Usuario = edtUsuario.getText().toString();

            int validate = Usuario.compareTo(getResources().getString(R.string.Usuario_1).toString());

            if (validate == 1){
                startActivity(intentdatos);
                Toast.makeText(getApplicationContext(),"Usuario y contraeña correctos",Toast.LENGTH_LONG).show();
            }
            else {
                Toast.makeText(getApplicationContext(),"Usuario o contraseña incorrectas, intentalo de nuevo",Toast.LENGTH_LONG).show();
            }



        }
    };
}
