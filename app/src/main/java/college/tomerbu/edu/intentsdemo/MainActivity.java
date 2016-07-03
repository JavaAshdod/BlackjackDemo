package college.tomerbu.edu.intentsdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private BlackJackDeck deck;
    TextView tvPlayerScore, tvDealerScore;
    ImageView ivPlayerCard, ivDealerCard;
    Button btnDraw, btnStand;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


         initLayout();
        deck = new BlackJackDeck(getResources());

        btnDraw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawCard();
            }
        });

    }

    private void drawCard() {
        BlackjackCard card = deck.draw();
        if (card != null)
            ivPlayerCard.setImageResource(card.getImageResId());
    }


    private void initLayout() {
        tvPlayerScore = (TextView) findViewById(R.id.tvPlayerScore);
        tvDealerScore = (TextView) findViewById(R.id.tvScoreDealer);

        ivPlayerCard = (ImageView) findViewById(R.id.ivPlayerCard);
        ivDealerCard = (ImageView) findViewById(R.id.ivDealerCard);

        btnDraw = (Button) findViewById(R.id.btnDraw);
        btnStand = (Button) findViewById(R.id.btnStand);
    }
}
