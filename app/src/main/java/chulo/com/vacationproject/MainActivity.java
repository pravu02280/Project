package chulo.com.vacationproject;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.kosalgeek.asynctask.AsyncResponse;
import com.kosalgeek.asynctask.PostResponseAsyncTask;

public class MainActivity extends AppCompatActivity implements AsyncResponse {
Button bclick;
    EditText etusername,etPassword;
    public static TextView tfetchdata;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bclick = (Button) findViewById(R.id.activity_mani_btn_clickme);
        PostResponseAsyncTask task = new PostResponseAsyncTask(this);
        //local ma rakhne vhayera yo leknu parxa
task.execute("http://localhost/client/login.php");
        /* 1.fetch_data_comment
        tfetchdata= (TextView) findViewById(R.id.activity_mani_tv_fetch);
        bclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FetchData process=new FetchData();
                process.execute();

            }
        });*/
    }

    @Override
    public void processFinish(String s) {

    }
}
