package com.example.emojidescriber;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_list);

        ImageButton coldButton = findViewById(R.id.cold);
        ImageButton cryButton = findViewById(R.id.cry);
        ImageButton screamButton = findViewById(R.id.scream);
        ImageButton angerButton = findViewById(R.id.anger);
        ImageButton fearButton = findViewById(R.id.fear);
        ImageButton hotButton = findViewById(R.id.hot);
        ImageButton hugButton = findViewById(R.id.hug);
        ImageButton pleadButton = findViewById(R.id.plead);
        ImageButton poutingButton = findViewById(R.id.pout);
        ImageButton rollingButton = findViewById(R.id.rollLough);
        ImageButton shushButton = findViewById(R.id.shush);
        ImageButton sleepButton = findViewById(R.id.sleep);
        ImageButton smileButton = findViewById(R.id.smile);

        coldButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListActivity.this, EmojiDescriptionActivity.class);
                intent.putExtra("emojiImageResId", R.drawable.cold_face_svgrepo_com);
                intent.putExtra("emojiTextDescription", getString(R.string.Cold_Emoji_Description));
                intent.putExtra("emojiTextUsage", getString(R.string.Cold_Emoji_Usage));
                intent.putExtra("backgroundColor", getResources().getColor(R.color.LightTeal));
                intent.putExtra("textColor", getResources().getColor(R.color.Teal));
                intent.putExtra("ButtonColor", getResources().getColor(R.color.Teal));
                startActivity(intent);
            }
        });
        cryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListActivity.this, EmojiDescriptionActivity.class);
                intent.putExtra("emojiImageResId", R.drawable.crying_face_svgrepo_com);
                intent.putExtra("emojiTextDescription", getString(R.string.Crying_Emoji_Description));
                intent.putExtra("emojiTextUsage", getString(R.string.Crying_Emoji_Usage));
                intent.putExtra("backgroundColor", getResources().getColor(R.color.LightCyan));
                intent.putExtra("textColor", getResources().getColor(R.color.DarkBlue));
                intent.putExtra("ButtonColor", getResources().getColor(R.color.DarkBlue));
                startActivity(intent);
            }
        });
screamButton.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(ListActivity.this, EmojiDescriptionActivity.class);
        intent.putExtra("emojiImageResId", R.drawable.face_screaming_in_fear_svgrepo_com);
        intent.putExtra("emojiTextDescription", getString(R.string.Screaming_Face_Emoji_Description));
        intent.putExtra("emojiTextUsage", getString(R.string.Screaming_Face_Emoji_Usage));
        intent.putExtra("backgroundColor", getResources().getColor(R.color.LightPeach));
        intent.putExtra("textColor", getResources().getColor(R.color.BurntOrange));
        intent.putExtra("ButtonColor", getResources().getColor(R.color.DarkOrange));
        startActivity(intent);

    }
});
angerButton.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(ListActivity.this, EmojiDescriptionActivity.class);
        intent.putExtra("emojiImageResId", R.drawable.face_with_symbols_on_mouth_svgrepo_com);
        intent.putExtra("emojiTextDescription", getString(R.string.Face_With_Symbols_Emoji_Description));
        intent.putExtra("emojiTextUsage", getString(R.string.Face_With_Symbols_Emoji_Usage));
        intent.putExtra("backgroundColor", getResources().getColor(R.color.LightPink));
        intent.putExtra("textColor", getResources().getColor(R.color.DarkRed2));
        intent.putExtra("ButtonColor", getResources().getColor(R.color.DarkRed2));
        startActivity(intent);
    }
});
        fearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListActivity.this, EmojiDescriptionActivity.class);
                intent.putExtra("emojiImageResId", R.drawable.fearful_face_svgrepo_com);
                intent.putExtra("emojiTextDescription", getString(R.string.Fear_Full_Face_Emoji_Description));
                intent.putExtra("emojiTextUsage", getString(R.string.Fear_Full_Face_Emoji_Usage));
                intent.putExtra("backgroundColor", getResources().getColor(R.color.LightPeach));
                intent.putExtra("textColor", getResources().getColor(R.color.BurntOrange));
                intent.putExtra("ButtonColor", getResources().getColor(R.color.DarkOrange));
                startActivity(intent);
            }
        });
        hotButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListActivity.this, EmojiDescriptionActivity.class);
                intent.putExtra("emojiImageResId", R.drawable.hot_face_svgrepo_com);
                intent.putExtra("emojiTextDescription", getString(R.string.Hot_Face_Emoji_Description));
                intent.putExtra("emojiTextUsage", getString(R.string.Hot_Face_Emoji_Usage));
                intent.putExtra("backgroundColor", getResources().getColor(R.color.LightPink));
                intent.putExtra("textColor", getResources().getColor(R.color.DarkRed2));
                intent.putExtra("ButtonColor", getResources().getColor(R.color.DarkRed2));
                startActivity(intent);
            }
        });
        hugButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListActivity.this, EmojiDescriptionActivity.class);
                intent.putExtra("emojiImageResId", R.drawable.hugging_face_svgrepo_com);
                intent.putExtra("emojiTextDescription", getString(R.string.Hugging_Face_Emoji_Description));
                intent.putExtra("emojiTextUsage", getString(R.string.Hugging_Face_Emoji_Usage));
                intent.putExtra("backgroundColor", getResources().getColor(R.color.LightYellow));
                intent.putExtra("textColor", getResources().getColor(R.color.Brown));
                intent.putExtra("ButtonColor", getResources().getColor(R.color.DeepBrown));
                startActivity(intent);
            }
        });
        pleadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListActivity.this, EmojiDescriptionActivity.class);
                intent.putExtra("emojiImageResId", R.drawable.pleading_face_svgrepo_com);
                intent.putExtra("emojiTextDescription", getString(R.string.Pleading_Face_Emoji_Description));
                intent.putExtra("emojiTextUsage", getString(R.string.Cold_Emoji_Usage));
                intent.putExtra("backgroundColor", getResources().getColor(R.color.LightPeach));
                intent.putExtra("textColor", getResources().getColor(R.color.BurntOrange));
                intent.putExtra("ButtonColor", getResources().getColor(R.color.DarkOrange));
                startActivity(intent);
            }
        });
        poutingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListActivity.this, EmojiDescriptionActivity.class);
                intent.putExtra("emojiImageResId", R.drawable.pouting_face_svgrepo_com);
                intent.putExtra("emojiTextDescription", getString(R.string.Pouting_Face_Emoji_Description));
                intent.putExtra("emojiTextUsage", getString(R.string.Pouting_Face_Emoji_Usage));
                intent.putExtra("backgroundColor", getResources().getColor(R.color.LightPink));
                intent.putExtra("textColor", getResources().getColor(R.color.DarkRed2));
                intent.putExtra("ButtonColor", getResources().getColor(R.color.DarkRed2));
                startActivity(intent);
            }
        });

        rollingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListActivity.this, EmojiDescriptionActivity.class);
                intent.putExtra("emojiImageResId", R.drawable.rolling_on_the_floor_laughing_svgrepo_com);
                intent.putExtra("emojiTextDescription", getString(R.string.Rolling_on_the_Floor_Face_Emoji_Description));
                intent.putExtra("emojiTextUsage", getString(R.string.Rolling_on_the_Floor_Face_Emoji_Usage));
                intent.putExtra("backgroundColor", getResources().getColor(R.color.LightPeach));
                intent.putExtra("textColor", getResources().getColor(R.color.BurntOrange));
                intent.putExtra("ButtonColor", getResources().getColor(R.color.DarkOrange));
                startActivity(intent);
            }
        });

        shushButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListActivity.this, EmojiDescriptionActivity.class);
                intent.putExtra("emojiImageResId", R.drawable.shushing_face_svgrepo_com);
                intent.putExtra("emojiTextDescription", getString(R.string.Shushing_Face_Emoji_Description));
                intent.putExtra("emojiTextUsage", getString(R.string.Shushing_Face_Emoji_Usage));
                intent.putExtra("backgroundColor", getResources().getColor(R.color.LightYellow));
                intent.putExtra("textColor", getResources().getColor(R.color.Brown));
                intent.putExtra("ButtonColor", getResources().getColor(R.color.DeepBrown));
                startActivity(intent);
            }
        });

        sleepButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListActivity.this, EmojiDescriptionActivity.class);
                intent.putExtra("emojiImageResId", R.drawable.sleeping_face_svgrepo_com);
                intent.putExtra("emojiTextDescription", getString(R.string.Sleeping_Face_Emoji_Description));
                intent.putExtra("emojiTextUsage", getString(R.string.Pleading_Face_Emoji_Usage));
                intent.putExtra("backgroundColor", getResources().getColor(R.color.LightCyan));
                intent.putExtra("textColor", getResources().getColor(R.color.DarkBlue));
                intent.putExtra("ButtonColor", getResources().getColor(R.color.DarkBlue));
                startActivity(intent);
            }
        });

        smileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListActivity.this, EmojiDescriptionActivity.class);
                intent.putExtra("emojiImageResId", R.drawable.slightly_smiling_face_svgrepo_com);
                intent.putExtra("emojiTextDescription", getString(R.string.Slight_Smile_Face_Emoji_Description));
                intent.putExtra("emojiTextUsage", getString(R.string.Slight_Smile_Face_Emoji_Usage));
                intent.putExtra("backgroundColor", getResources().getColor(R.color.LightYellow));
                intent.putExtra("textColor", getResources().getColor(R.color.Brown));
                intent.putExtra("ButtonColor", getResources().getColor(R.color.DeepBrown));
                startActivity(intent);
            }
        });




    }
}
