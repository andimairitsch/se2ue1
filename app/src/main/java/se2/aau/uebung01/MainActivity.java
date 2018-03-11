package se2.aau.uebung01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void palindrome(View view){
        EditText text = findViewById(R.id.editText);
        TextView outputView = findViewById(R.id.textView3);
        String input=text.getText().toString();

        if(text.length()>=5){
            boolean isPalindrom = isPalindrome(input);

            if(isPalindrom){
                outputView.setText("ist ein Palindrom");
            }
            else{
                outputView.setText("Ist kein Palindrom");
            }
        }
        else{
            if(input.length()==0){
               outputView.setText("Eingabetext ist leer");
            }else {
               outputView.setText("Eingabetext ist zu kurz");
            }
        }
        outputView.setVisibility(View.VISIBLE);

    }
    public static boolean isPalindrome(String str){
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
