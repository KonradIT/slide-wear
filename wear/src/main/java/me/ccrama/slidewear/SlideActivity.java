package me.ccrama.slidewear;

import android.app.Activity;
import android.os.Bundle;
import android.support.wearable.view.WatchViewStub;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class SlideActivity extends Activity {

    private ImageButton upvote;
    private ImageButton downvote;
    private ImageButton save;

    private ImageButton upvote2;
    private ImageButton downvote2;
    private ImageButton save2;

    private ImageButton upvote3;
    private ImageButton downvote3;
    private ImageButton save3;

    private ImageButton upvote4;
    private ImageButton downvote4;
    private ImageButton save4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide);
        final WatchViewStub stub = (WatchViewStub) findViewById(R.id.watch_view_stub);
        stub.setOnLayoutInflatedListener(new WatchViewStub.OnLayoutInflatedListener() {
            @Override
            public void onLayoutInflated(WatchViewStub stub) {
                upvote = (ImageButton) stub.findViewById(R.id.upvoteBtn);
                upvote2 = (ImageButton) stub.findViewById(R.id.upvoteBtn2);
                upvote3 = (ImageButton) stub.findViewById(R.id.upvoteBtn3);
                upvote4 = (ImageButton) stub.findViewById(R.id.upvoteBtn4);
                downvote = (ImageButton) stub.findViewById(R.id.downvoteBtn);
                downvote2 = (ImageButton) stub.findViewById(R.id.downvoteBtn2);
                downvote3 = (ImageButton) stub.findViewById(R.id.downvoteBtn3);
                downvote4 = (ImageButton) stub.findViewById(R.id.downvoteBtn4);
                save = (ImageButton) stub.findViewById(R.id.saveBtn);
                save2 = (ImageButton) stub.findViewById(R.id.saveBtn2);
                save3 = (ImageButton) stub.findViewById(R.id.saveBtn3);
                save4 = (ImageButton) stub.findViewById(R.id.saveBtn4);

                upvote.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        upvote.setImageResource(R.drawable.ic_action_upvote_active);
                    }
                });
                upvote2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        upvote2.setImageResource(R.drawable.ic_action_upvote_active);
                    }
                });
                upvote3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        upvote3.setImageResource(R.drawable.ic_action_upvote_active);
                    }
                });
                upvote4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        upvote4.setImageResource(R.drawable.ic_action_upvote_active);
                    }
                });

                downvote.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        downvote.setImageResource(R.drawable.ic_action_downvote_active);
                    }
                });
                downvote2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        downvote2.setImageResource(R.drawable.ic_action_downvote_active);
                    }
                });
                downvote3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        downvote3.setImageResource(R.drawable.ic_action_downvote_active);
                    }
                });
                downvote4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        downvote4.setImageResource(R.drawable.ic_action_downvote_active);
                    }
                });

                save.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        save.setImageResource(R.drawable.ic_action_saved);
                    }
                });

                save2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        save2.setImageResource(R.drawable.ic_action_saved);
                    }
                });

                save3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        save3.setImageResource(R.drawable.ic_action_saved);
                    }
                });

                save4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        save4.setImageResource(R.drawable.ic_action_saved);
                    }
                });
            }
        });
    }
}
