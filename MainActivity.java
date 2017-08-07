package com.amar.org.cardviewsample;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private CardView cardView;
    private ImageView likeImage;

    boolean isClicked = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardView = (CardView) findViewById(R.id.cardView);
        likeImage = (ImageView) findViewById(R.id.like_image);

        cardView.setUseCompatPadding(true);
        cardView.setContentPadding(30, 30, 30, 0);
        cardView.setPreventCornerOverlap(true);
        cardView.setCardBackgroundColor(Color.WHITE);
        cardView.setCardElevation(2.1f);
        cardView.setRadius(0);
        cardView.setMaxCardElevation(3f);

        likeImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isClicked) {
//                    view.setBackgroundColor(Color.parseColor("#FF0000"));
                    likeImage.setColorFilter(Color.RED);
                    isClicked = false;
                } else {
                    likeImage.setColorFilter(Color.CYAN);
                    isClicked = true;
                }
            }
        });
    }
}
