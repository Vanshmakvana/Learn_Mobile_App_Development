 package com.example.navigationdrawermad; 
 
import androidx.annotation.NonNull; 
import androidx.appcompat.app.ActionBarDrawerToggle; 
import androidx.appcompat.app.AppCompatActivity; 
import androidx.appcompat.widget.Toolbar; 
import androidx.core.view.GravityCompat; 
import androidx.drawerlayout.widget.DrawerLayout; 
import androidx.fragment.app.Fragment; 
import androidx.fragment.app.FragmentTransaction; 
 
import android.app.Activity; 
import android.os.Bundle; 
import android.view.MenuItem; 
import android.widget.FrameLayout; 
 
import com.google.android.material.navigation.NavigationView; 
 
public class MainActivity extends AppCompatActivity  { 
    DrawerLayout drawerLayout; 
    Toolbar toolbar; 
    FrameLayout frameLayout; 
    NavigationView navigationView; 
 
 
    @Override 
    protected void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.activity_main); 
 
        drawerLayout = findViewById(R.id.drawer_layout); 
        toolbar = findViewById(R.id.toolbar); 
        frameLayout = findViewById(R.id.frame); 
        navigationView = findViewById(R.id.nav_drawer); 
        setSupportActionBar(toolbar); 
 
        ActionBarDrawerToggle toggle = new 
 
ActionBarDrawerToggle(this,drawerLayout, 
                
toolbar,R.string.nav_drawer_open,R.string.nav_drawer_close); 
        drawerLayout.addDrawerListener(toggle); 
        toggle.syncState(); 
 
        navigationView.setNavigationItemSelectedListener(new 
NavigationView.OnNavigationItemSelectedListener() { 
            @Override 
            public boolean onNavigationItemSelected(@NonNull MenuItem 
menuItem) { 
                Fragment fragment; 
                switch(menuItem.getItemId()){ 
                    case R.id.home: 
                        setTitle("Home"); 
                        fragment=new HomeFragment(); 
                        loadFragment(fragment); 
                        drawerLayout.closeDrawer(GravityCompat.START); 
                        break; 
 
                    case R.id.about: 
                        setTitle("About"); 
                        fragment=new AboutFragment(); 
                        loadFragment(fragment); 
                        drawerLayout.closeDrawer(GravityCompat.START); 
                        break  ; 
   case R.id.feedback: 
           setTitle("Feedback"); 
                fragment=new FeedbackFragment(); 
                 loadFragment(fragment); 
          drawerLayout.closeDrawer(GravityCompat.START); 
                          break  ; 
                } 
                return false; 
            } 
        }); 
    } 
 
    private void loadFragment(Fragment fragment) { 
        FragmentTransaction transaction = 
getSupportFragmentManager().beginTransaction(); 
        transaction.replace(R.id.frame,fragment); 
        transaction.addToBackStack(null); 
        transaction.commit(); 
          } 
 
    /** 
     * Called when the activity has detected the user's press of the 
back 
     * key. The {@link #getOnBackPressedDispatcher() 
OnBackPressedDispatcher} will be given a 
     * chance to handle the back button before the default behavior of 
     * {@link Activity#onBackPressed()} is invoked. 
     * 
     * @see #getOnBackPressedDispatcher() 
     */ 
    @Override 
    public void onBackPressed() { 
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){ 
            drawerLayout.closeDrawer(GravityCompat.START); 
        }else { 
            super.onBackPressed(); 
        } 
    } 
}
