package com.example.android.phonenumber2;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import static com.example.android.phonenumber2.R.id.phonenumber;

public class MainActivity extends AppCompatActivity {
    int number = 0 ;
    String letter = " ";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**

     This method is called when the order button is clicked.
     */
    public void submitOne(View view) {
        display(1);
    }
    public void submitTwo(View view) {
        display(2);
    }
    public void submitThree(View view) {
        display(3);
    }
    public void submitFour(View view) {
        display(4);
    }
    public void submiTFive(View view) {
        display(5);
    }
    public void submitSIX(View view) {
        display(6);
    }
    public void submitSeven(View view) {
        display(7);
    }
    public void submitEight(View view) {
        display(8);
    }
    public void submitNine(View view) {
        display(9);
    }
    public void submitStar(View view) {
        letter = "*";
        display(letter);
    }
    public void submitZero(View view) {
        display(0);
    }
    public void submitHashtag(View view) {
        letter = "#";
        display(letter);
    }
    public void submitDelete(View view) {
        display("Delete");
    }

    /**
    /**

    /**

    /**
    /**
    /**
     *
     */
    /**
    /**
    /**
    /**
    /**
    /**

     This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.phonenumber);
        quantityTextView.setText("" + number);
    }
    private void display(String letter ) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.phonenumber);
        quantityTextView.setText("" + letter);
    }
}
