package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:

    private TextView mStoryText;
    private Button mTopAnswer;
    private Button mBottomAnswer;

    private int mStoryIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

        mStoryText = (TextView)findViewById(R.id.storyTextView);
        mTopAnswer = (Button)findViewById(R.id.buttonTop);
        mBottomAnswer = (Button)findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        mTopAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                Toast.makeText(getApplicationContext(), "Top Button was clicked.", Toast.LENGTH_SHORT).show();

                if (mStoryIndex == 1 || mStoryIndex == 2) {
                    mStoryText.setText(R.string.T3_Story);
                    mTopAnswer.setText(R.string.T3_Ans1);
                    mBottomAnswer.setText(R.string.T3_Ans2);
                    mStoryIndex = 3;
                } else if (mStoryIndex == 3) {
                    mStoryText.setText(R.string.T6_End);
                    mTopAnswer.setVisibility(View.INVISIBLE);
                    mBottomAnswer.setVisibility(View.INVISIBLE);
                }
            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        mBottomAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(), "Bottom Button was pinched!", Toast.LENGTH_SHORT).show();

                if (mStoryIndex == 1) {
                    mStoryText.setText(R.string.T2_Story);
                    mTopAnswer.setText(R.string.T2_Ans1);
                    mBottomAnswer.setText(R.string.T2_Ans2);
                    mStoryIndex = 2;
                } else if (mStoryIndex == 3) {
                    mStoryText.setText(R.string.T5_End);
                    mTopAnswer.setVisibility(View.INVISIBLE);
                    mBottomAnswer.setVisibility(View.INVISIBLE);
                } else if (mStoryIndex == 2) {
                    mStoryText.setText(R.string.T4_End);
                    mTopAnswer.setVisibility(View.INVISIBLE);
                    mBottomAnswer.setVisibility(View.INVISIBLE);
                }

            }
        });
    }
}
