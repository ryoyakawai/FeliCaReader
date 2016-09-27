package com.example.sakura.felicareader.felicareader;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.sakura.felicareader.R;

public class HistoryView extends Fragment {

    private View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.historyview_fragment, container, false);

        Log.v("Cardview", getArguments().getString("card"));
        Log.v("Dataview", getArguments().getString("data"));

        // カード表示
        TextView cardText = (TextView) view.findViewById(R.id.card);
        cardText.setText(getArguments().getString("card"));
        // 残高表示
        TextView balanceText = (TextView) view.findViewById(R.id.balance);
        balanceText.setText(getArguments().getString("data"));

        return view;
    }


}
