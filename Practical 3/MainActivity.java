import android.app.Activity; 
import android.os.Bundle; 
import android.view.View; 
import android.widget.Button; 
import android.widget.EditText; 
import android.widget.Toast; 
 
public class MainActivity extends Activity 
{ 
    EditText string1,string2; 
    Button add,sub,div,mul; 
 
    @Override 
    protected void onCreate(Bundle savedInstanceState) 
    { 
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.activity_main); 
 
        string1 = (EditText) findViewById(R.id.num1); 
        string2 = (EditText) findViewById(R.id.num2); 
 
        add = (Button) findViewById(R.id.add_btn); 
        sub = (Button) findViewById(R.id.sub_btn); 
        div = (Button) findViewById(R.id.div_btn); 
        mul = (Button) findViewById(R.id.mul_btn); 
 
        addition(); 
        subtraction(); 
        divison(); 
        multiplication(); 
 
    } 
 
    private void multiplication() { 
        mul.setOnClickListener(new View.OnClickListener() 
        { 
            @Override 
            public void onClick(View v) 
            { 
                int number1 = 
Integer.parseInt(string1.getText().toString()); 
                int number2 = 
Integer.parseInt(string2.getText().toString()); 
 
                int mult = number1 * number2; 
 
                Toast.makeText(getApplicationContext(),"Multiplication 
= "+mult,Toast.LENGTH_SHORT).show(); 
            } 
        }); 
    } 
 
    private void divison() { 
        div.setOnClickListener(new View.OnClickListener() 
        { 
            @Override 
            public void onClick(View v) 
            { 
                int number1 = 
Integer.parseInt(string1.getText().toString()); 
                int number2 = 
Integer.parseInt(string2.getText().toString()); 
 
                int divi = number1 / number2; 
 
                Toast.makeText(getApplicationContext(),"Divison = 
"+divi,Toast.LENGTH_SHORT).show(); 
            } 
        }); 
    } 
 
 
    public void addition() 
    { 
        add.setOnClickListener(new View.OnClickListener() 
        { 
            @Override 
            public void onClick(View v) 
            { 
                int number1 = 
Integer.parseInt(string1.getText().toString()); 
                int number2 = 
Integer.parseInt(string2.getText().toString()); 
 
                int addition = number1 + number2; 
 
                Toast.makeText(getApplicationContext(),"Addition = 
"+addition,Toast.LENGTH_SHORT).show(); 
            } 
        }); 
    } 
    private void subtraction() 
    { 
        sub.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public void onClick(View v) { 
                int number1 = 
Integer.parseInt(string1.getText().toString()); 
                int number2 = 
Integer.parseInt(string2.getText().toString()); 
 
                int subt = number1 - number2; 
 
                Toast.makeText(getApplicationContext(), "Subtraction = 
" + subt, Toast.LENGTH_SHORT).show(); 
            } 
        }); 
    } 
}
