package com.uninorte.jrocam.calculadoraroca;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    TextView pila;
    TextView total;
    int n = 0;
    int n1= 0;
    int tot=0;
    String op;
    boolean noHaEntrado = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pila = (TextView) findViewById(R.id.Pila);
        total = (TextView) findViewById(R.id.Total);
        total.setText("0");
        pila.setText("");
    }

    public void onNumeroClick(View view) {
        Button b = (Button) view;
        String buton = (String) b.getText();
        String loquehay = (String) total.getText();
        int antes = Integer.parseInt(loquehay);
        if (noHaEntrado){
            n = (antes*10)+Integer.parseInt(buton);
            total.setText(String.valueOf(n));
        }else{
            n =Integer.parseInt(buton);
            total.setText(String.valueOf(n));
        }


    }
    public void onOperacionClick(View view) {
        Button b = (Button) view;
        String buton = (String) b.getText();
        String num = String.valueOf(n);
        if(noHaEntrado){
            n1 = n;
            op = buton;
            /*if (!Objects.equals(tot, "0")){
                if(Objects.equals(buton, "+")){
                    total.setText("0");
                    pila.append(tot+" ");
                    n1=tot;
                    pila.append("+ ");
                    noHaEntrado=false;
                }
                if(Objects.equals(buton, "-")){
                    total.setText("0");
                    pila.append(tot+" ");
                    n1=tot;
                    pila.append("- ");
                    noHaEntrado=false;
                }
                if(Objects.equals(buton, "=")){
                    pila.setText("");
                    total.setText("0");
                    noHaEntrado=true;
                }
            }else{
                if(Objects.equals(buton, "+")){
                    total.setText("0");
                    pila.append(num+" ");
                    pila.append("+ ");
                    noHaEntrado=false;
                }
                if(Objects.equals(buton, "-")){
                    total.setText("0");
                    pila.append(num+" ");
                    pila.append("- ");
                    noHaEntrado=false;
                }
                if(Objects.equals(buton, "=")){
                    pila.setText("");
                    total.setText("0");
                    noHaEntrado=true;
                }
            }*/
            if(Objects.equals(buton, "+")){
                total.setText("0");
                pila.append(num+" ");
                pila.append("+ ");
                noHaEntrado=false;
            }
            if(Objects.equals(buton, "-")){
                total.setText("0");
                pila.append(num+" ");
                pila.append("- ");
                noHaEntrado=false;
            }
            if(Objects.equals(buton, "=")){
                pila.setText("");
                total.setText("0");
                noHaEntrado=true;
            }

        }else{
            if(Objects.equals(buton, "+")){
                total.setText("0");
                pila.append(n+" ");
                tot = n1+n;
                n1=tot;
                total.setText(String.valueOf(tot));

                pila.append("+ ");
            }
            if(Objects.equals(buton, "-")){
                total.setText("0");
                pila.append(n+" ");
                tot = n1-n;
                n1=tot;
                total.setText(String.valueOf(tot));
                pila.append("- ");
            }
            if(Objects.equals(buton, "=")){
                pila.setText("");
                if (Objects.equals(op, "+")){
                    tot= n1+n;
                }else{
                    tot = n1-n;
                }
                total.setText(String.valueOf(tot));
                noHaEntrado=true;
                n=0;
                n1=0;
            }
        }

    }

}
