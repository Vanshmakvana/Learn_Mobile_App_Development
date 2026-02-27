package kmn.Six; 
 
import android.app.Activity; 
import android.os.Bundle; 
import android.view.View; 
import android.widget.AdapterView; 
import android.widget.ImageView; 
import android.widget.Spinner; 
import android.widget.Toast; 
import android.widget.AdapterView.OnItemSelectedListener; 
 
public class SixActivity extends Activity implements 
OnItemSelectedListener  
{ 
   Integer[] imageIDs =  
   { 
       R.drawable.it, 
     R.drawable.elect, 
    R.drawable.chem, 
    R.drawable.mech, 
   }; 
                      
    public void onCreate(Bundle savedInstanceState)  
    { 
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.main); 
        Spinner s = (Spinner)findViewById(R.id.spinner1); 
        s.setOnItemSelectedListener(this); 
    } 
   public void onItemSelected(AdapterView<?> arg0, View arg1, int 
arg2, 
         long arg3)  
   { 
      Toast.makeText(this, "Selected Item is = "+ 
arg0.getSelectedItem().toString(), Toast.LENGTH_SHORT).show(); 
      ImageView i = (ImageView)findViewById(R.id.imageView1); 
      i.setImageResource(imageIDs[arg2]); 
   } 
   public void onNothingSelected(AdapterView<?> arg0)  
   { 
       
   } 
}
