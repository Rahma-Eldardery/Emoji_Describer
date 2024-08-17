package com.example.emojidescriber;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
public class EmojiDescriptionActivity extends AppCompatActivity {

    private ImageView emojiImageView;
    private TextView emojiTextViewDescription,emojiTextViewUsage,descriptionTitle,usageTitle;
    private ScrollView descriptionLayout;
    private ImageButton  listButton ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_emoji_description);


        emojiImageView = findViewById(R.id.emojiImage);
        usageTitle = findViewById(R.id.titleEmojiUsage);
        descriptionTitle = findViewById(R.id.titleEmojiDescription);
        emojiTextViewUsage = findViewById(R.id.emojiUsage);
        emojiTextViewDescription = findViewById(R.id.emojiDescription);
        descriptionLayout = findViewById(R.id.descriptionLayout);
        listButton = findViewById(R.id.buttonList);

        Intent intent = getIntent();
        int emojiImageResId = intent.getIntExtra("emojiImageResId", 0);
        String emojiTextDescription = intent.getStringExtra("emojiTextDescription");
        String emojiTextUsage = intent.getStringExtra("emojiTextUsage");
        int backgroundColor = intent.getIntExtra("backgroundColor", Color.WHITE);
        int textColor = intent.getIntExtra("textColor", Color.BLACK);
        int buttonColor = intent.getIntExtra("ButtonColor",Color.WHITE);

        emojiImageView.setImageResource(emojiImageResId);
        emojiTextViewDescription.setText(emojiTextDescription);
        emojiTextViewDescription.setTextColor(textColor);
        emojiTextViewUsage.setText(emojiTextUsage);
        emojiTextViewUsage.setTextColor(textColor);
        descriptionTitle.setTextColor(textColor);
        usageTitle.setTextColor(textColor);
        descriptionLayout.setBackgroundColor(backgroundColor);
        listButton.setBackgroundColor(buttonColor);
    }


    public void goToList(View v){
        Intent intent = new Intent(EmojiDescriptionActivity.this,ListActivity.class);
        startActivity(intent);
    }
}