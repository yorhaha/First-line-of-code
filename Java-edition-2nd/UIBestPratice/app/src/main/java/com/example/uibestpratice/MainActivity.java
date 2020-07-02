package com.example.uibestpratice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Msg> msgList = new ArrayList<>();
    private EditText inputText;
    private Button send;
    private RecyclerView msgRecyclerView;
    private MsgAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initMsgs();
        inputText = (EditText)findViewById(R.id.input_text);
        send = (Button)findViewById(R.id.send);
        msgRecyclerView = (RecyclerView)findViewById(R.id.msg_recycler_view);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        msgRecyclerView.setLayoutManager(layoutManager);
        adapter = new MsgAdapter(msgList);
        msgRecyclerView.setAdapter(adapter);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String content = inputText.getText().toString();
                if(!content.equals("")) {
                    Msg msg = new Msg(content, Msg.TYPE_SEND);
                    msgList.add(msg);
                    adapter.notifyItemInserted(msgList.size() - 1);
                    inputText.setText("");
                }
            }
        });

    }

    private void initMsgs() {
        Msg msg1 = new Msg("Hello guy", Msg.TYPE_RECEIVED);
        Msg msg2 = new Msg("Hello. Who is that?", Msg.TYPE_SEND);
        Msg msg3 = new Msg("This is Tom. Nice talking to you.", Msg.TYPE_RECEIVED);
        msgList.add(msg1);
        msgList.add(msg2);
        msgList.add(msg3);
    }
}
