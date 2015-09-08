package com.senbonzakura.marin.formulario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {
    EditText passedname=null;
    EditText passedemail=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        passedname = (EditText) findViewById(R.id.edt0); // create fields
         passedemail = (EditText) findViewById(R.id.edt1); // create fields
        //obtener extras del bundle zip
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        // if else para asignar  los valores del bundle a strings
        if(bundle!=null){
            String nembe = (String) bundle.get("Nombre");
            passedname.setText(nembe);
            String mairu = (String) bundle.get("Email");
            passedemail.setText(mairu);




        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_second, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
