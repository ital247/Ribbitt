package derick.com.ribbit;

import android.app.Application;

import com.parse.Parse;


/**
 * Created by Gilbert on 6/28/2015.
 */
public class RibbitApplication extends Application{

    @Override
    public void onCreate(){
        super.onCreate();
        Parse.enableLocalDatastore(this);
        Parse.initialize(this, "ED7yMSF1qK3tNrT8HGMinXyOZj4CCV49e92nAj3p", "QYfIGOW1BskhzFM9qML4KOtMlJxsTXAvNTAzMDIW");


      /*  ParseObject testObject = new ParseObject("TestObject");
        testObject.put("foo", "bar");
      *///*  testObject.saveInBackground();
    }
}
