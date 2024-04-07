package com.example.mesdeputes;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DeputyActivity extends AppCompatActivity {

    private ImageView imageView;
    // ajouter date Naissance et lieuNaissance
    private TextView textViewName, textViewCirco, textViewEmail, textViewGroupe, dateNaissance, LieuNaissance, nomCirco, organisme, mandateDebut;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deputy);
        textViewName= findViewById(R.id.textViewDeputyName);
        textViewCirco= findViewById(R.id.textViewDeputyCirco);
        textViewGroupe= findViewById(R.id.textViewDeputyGroupe);
        textViewEmail= findViewById(R.id.textViewDeputyEmail);
        imageView= findViewById(R.id.imageViewDeputy);
        // ajouter ça
        dateNaissance= findViewById(R.id.deputyDateNaissance);
        LieuNaissance= findViewById(R.id.deputyLieuNaissance);
        nomCirco = findViewById(R.id.NomCirco);
        //organisme = findViewById(R.id.Organisme);
        //mandateDebut = findViewById(R.id.MandatDebut);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Deputy deputy= (Deputy) getIntent().getSerializableExtra("deputy");
        textViewName.setText(deputy.getFirstname()+" "+deputy.getLastname());
        textViewCirco.setText(deputy.getDepartment()+", "+
                deputy.getNameCirco()+ " "+ deputy.getNumCirco()+
                (deputy.getNumCirco()==1? "er": "eme")+" circoncription");
        textViewGroupe.setText(deputy.getGroupe());
        textViewEmail.setText(deputy.getEmail());

        // ajouter ça
        dateNaissance.setText(deputy.getDateNaissance());
        LieuNaissance.setText(deputy.getLieuNaissance());
        nomCirco.setText(deputy.getNameCirco());
        //organisme.setText(deputy.getOrganisme());
        //mandateDebut.setText(deputy.getMandatDebut());
        ApiServices.loadDeputyAvatar(this, deputy.getNameForAvatar(), imageView);
    }

}
