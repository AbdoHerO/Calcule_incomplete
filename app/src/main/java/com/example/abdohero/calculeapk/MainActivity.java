package com.example.abdohero.calculeapk;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{

    EditText edit;
    TextView resultat;
    Button[] mesbuttons=new Button[21];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit=(EditText)findViewById(R.id.edit);
        resultat=(TextView)findViewById(R.id.resultat);
        mesbuttons[0]=(Button)findViewById(R.id.b0);
        mesbuttons[1]=(Button)findViewById(R.id.b1);
        mesbuttons[2]=(Button)findViewById(R.id.b2);
        mesbuttons[3]=(Button)findViewById(R.id.b3);
        mesbuttons[4]=(Button)findViewById(R.id.b4);
        mesbuttons[5]=(Button)findViewById(R.id.b5);
        mesbuttons[6]=(Button)findViewById(R.id.b6);
        mesbuttons[7]=(Button)findViewById(R.id.b7);
        mesbuttons[8]=(Button)findViewById(R.id.b8);
        mesbuttons[9]=(Button)findViewById(R.id.b9);
        mesbuttons[10]=(Button)findViewById(R.id.bpoint);
        mesbuttons[11]=(Button)findViewById(R.id.bplus);
        mesbuttons[12]=(Button)findViewById(R.id.bmult);
        mesbuttons[13]=(Button)findViewById(R.id.bmoins);
        mesbuttons[14]=(Button)findViewById(R.id.bdivision);
        mesbuttons[15]=(Button)findViewById(R.id.bmodulo);
        mesbuttons[16]=(Button)findViewById(R.id.befface);
        mesbuttons[17]=(Button)findViewById(R.id.bsin);
        mesbuttons[18]=(Button)findViewById(R.id.btan);
        mesbuttons[19]=(Button)findViewById(R.id.bcos);
        mesbuttons[20]=(Button)findViewById(R.id.begale);


        for(int i=0;i<21;i++)
        {
            mesbuttons[i].setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v) {
        String prvaleur="", dxvaleur="", imput = " ", opeteur = " ";
        switch (v.getId()){

            case R.id.b9:
                imput+="9";
                edit.setText(imput);
                break;
            case R.id.b8:
                imput+="8";
                edit.setText(imput);
                break;
            case R.id.b7:
                imput+="7";
                edit.setText(imput);
                break;
            case R.id.b6:
                imput+="6";
                edit.setText(imput);
                break;
            case R.id.b5:
                imput+="5";
                edit.setText(imput);
                break;
            case R.id.b4:
                imput+="4";
                edit.setText(imput);
                break;
            case R.id.b3:
                imput+="3";
                edit.setText(imput);
                break;
            case R.id.b2:
                imput+="2";
                edit.setText(imput);
                break;
            case R.id.b1:
                imput+="1";
                edit.setText(imput);
                break;
            case R.id.b0:
                imput+="0";
                edit.setText(imput);
                break;
            case R.id.bpoint:
                imput+=",";
                edit.setText(imput);

            /*case R.id.bplus:
                if(opeteur==""){
                    prvaleur=imput;
                    edit.setText(prvaleur);
                    imput="";
                }else{
                    dxvaleur=imput;}
                opeteur="+";
                edit.setText(prvaleur+"+"+dxvaleur);
                break;

            case R.id.bmoins:
                if(opeteur==""){
                    prvaleur=imput;
                    edit.setText(prvaleur);
                    imput="";
                }else{
                    dxvaleur=imput;}
                opeteur="-";
                edit.setText(prvaleur+opeteur+dxvaleur);
                break;

            case R.id.bdivision:
                if(opeteur==""){
                    prvaleur=imput;
                    edit.setText(prvaleur);
                    imput="";
                }else{
                    dxvaleur=imput;}
                opeteur="/";
                edit.setText(prvaleur+opeteur+dxvaleur);
                break;

            case R.id.bmult:
                if(opeteur==""){
                    prvaleur=imput;
                    edit.setText(prvaleur);
                    imput="";
                }else{
                    dxvaleur=imput;}
                opeteur="*";
                edit.setText(prvaleur+opeteur+dxvaleur);
                break;

            case R.id.bmodulo:
                if(opeteur==""){
                    prvaleur=imput;
                    edit.setText(prvaleur);
                    imput="";
                }else{
                    dxvaleur=imput;}
                opeteur="%";
                edit.setText(prvaleur+opeteur+dxvaleur);
                break;

            case R.id.bcos:
                if(opeteur!=""){
                    prvaleur=imput;
                    edit.setText("cos("+prvaleur+")");
                    imput="";
                }else{
                    prvaleur=imput;}
                break;

            case R.id.bsin:
                if(opeteur!=""){
                    prvaleur=imput;
                    edit.setText("sin("+prvaleur+")");
                    imput="";
                }else{
                    prvaleur=imput;}
                break;

            case R.id.btan:
                if(opeteur!=""){
                    prvaleur=imput;
                    edit.setText("tan("+prvaleur+")");
                    imput="";
                }else{
                    prvaleur=imput;}
                break;
*/
            case R.id.befface:
                imput="";
                prvaleur="";
                dxvaleur="";
                opeteur="";
            break;

        }
    }

}