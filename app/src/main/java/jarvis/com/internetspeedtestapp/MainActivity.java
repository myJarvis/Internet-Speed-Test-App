package jarvis.com.internetspeedtestapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {


    WebView internetTestWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Small Property of Jarvis !", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        internetTestWebView = (WebView) findViewById(R.id.internetTestWebView);

        internetTestWebView.setWebViewClient(new WebViewClient());
        internetTestWebView.loadUrl("https://fast.com/");
        internetTestWebView.getSettings().setJavaScriptEnabled(true);
    }

}
