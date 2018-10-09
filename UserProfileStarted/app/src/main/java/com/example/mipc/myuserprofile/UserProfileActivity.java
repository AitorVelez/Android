package com.example.mipc.myuserprofile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.bumptech.glide.Glide;
import com.google.gson.Gson;

public class UserProfileActivity extends AppCompatActivity {

    private User user;
    private Gson gson;
    private TextView nameview;
    private TextView lastnameview;
    private TextView handleview;
    private TextView followingview;
    private TextView followersview;
    private TextView aboutview;
    private ImageView profilePictureview;
    private ImageView backPictureview;
    private RequestQueue queue;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);

        gson = new Gson();
        queue = Volley.newRequestQueue(this);

        nameview=findViewById(R.id.nameview);
        lastnameview=findViewById(R.id.lastnameview);
        handleview=findViewById(R.id.handleview);
        followingview=findViewById(R.id.followingview);
        followersview=findViewById(R.id.followersview);
        aboutview=findViewById(R.id.aboutview);
        profilePictureview=findViewById(R.id.profilePictureview);
        backPictureview=findViewById(R.id.backPictureview);
        profilePictureview=findViewById(R.id.profilePictureview);


        queue.add(req);

    }

    private void updateUser(){

        nameview.setText(user.getName());
        lastnameview.setText(user.getLastname());
        handleview.setText(user.getHandle());
        followingview.setText(user.getFollowing());
        followersview.setText(user.getFollowers());
        aboutview.setText(user.getAbout());
        nameview.setText(user.getName());

    }
}
