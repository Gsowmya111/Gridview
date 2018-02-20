package edison.deepakraoj.gridview;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends Activity {
    GridView grid;
    String[] web = {
            "Google",
            "Github",
            "Instagram",
            "Facebook",
            "Flickr",
            "Pinterest",
            "Quora",
            "Twitter",
            "Vimeo",
            "WordPress",
            "Youtube",
            "Stumbleupon",
            "SoundCloud",
            "Reddit",
            "Blogger"

    } ;
    int[] imageId = {
            R.drawable.ac01,
            R.drawable.ac02,
            R.drawable.bell01,
            R.drawable.bell02,
            R.drawable.lock01,
            R.drawable.lock02,
            R.drawable.sprinkler01,
            R.drawable.sprinkler02,
            R.drawable.dimer01,
            R.drawable.dimer02,
            R.drawable.rgb01,
            R.drawable.rgb02,
            R.drawable.dog01,
            R.drawable.dimer02,
            R.drawable.bell01

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Custom_Grid adapter = new Custom_Grid(MainActivity.this, web, imageId);
        grid=(GridView)findViewById(R.id.grid);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(MainActivity.this, "You Clicked at " +web[+ position], Toast.LENGTH_SHORT).show();

            }
        });

    }

}
