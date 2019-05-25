package android.example.guessit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    public TextView value;
    public EditText guess;
    public EditText trials;
    public TextView pastvalues;
    public EditText edit;
    public TextView attempts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText trials = (EditText) findViewById(R.id.trials);
        EditText guess = (EditText) findViewById(R.id.guess);
    }

    public void guessgame(View v)
    {   String trialsStr = trials.getText().toString();
        float trials = Float.parseFloat(trialsStr);
        for (int i=0;i<trials;i++)
        {   int tries=1; float past = 0;
            String result ="";
            String guessStr = guess.getText().toString();
            int random = (int) (Math.random() * 100 + 1);
            float fguess = Float.parseFloat(guessStr);

            if(tries==1)
            {
                past = past + fguess;
                String mytext= "Past guesses:" + Float.toString(past)+"";
                pastvalues.setText(mytext);
            }

            if (fguess == random) {
                result = "Congratulation!";


            } else if (i == trials) {
                result = "GAME OVER";


            } else {
                if (fguess > random) {
                    result = "Wrong,Higher";
                } else {
                    result = "Wrong,Lower";
                }
            }
             String attempt = "Attempt number:"+""+i;
            value.setText(result);
            attempts.setText(attempt);
            edit.setText(null);
        }



    }








}
