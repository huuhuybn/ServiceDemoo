package vn.edu.poly.servicedemoo;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.widget.Toast;

public class MyService extends Service {
    public MyService() {

    }

    @Override
    public void onStart(Intent intent, int startId) {
        super.onStart(intent, startId);

        Bundle bundle = intent.getBundleExtra("data");

        int id = bundle.getInt("id");

        Toast.makeText(this, "ID : " + id, Toast.LENGTH_SHORT).show();


    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {


        return super.onStartCommand(intent, flags, startId);


    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
