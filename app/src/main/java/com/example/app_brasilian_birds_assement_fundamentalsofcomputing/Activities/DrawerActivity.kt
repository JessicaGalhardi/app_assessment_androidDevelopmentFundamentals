package com.example.app_brasilian_birds_assement_fundamentalsofcomputing.Activities



import android.content.Intent
import android.os.Bundle
import android.view.MenuItem

import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.example.app_brasilian_birds_assement_fundamentalsofcomputing.R
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_drawer.*



class DrawerActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drawer)

        val drawerLayout = layoutInflater.inflate(R.layout.activity_drawer, null) as DrawerLayout?


        super.setContentView(drawerLayout)

        val Toolbar = findViewById<Toolbar>(R.id.toolbar_content)
        setSupportActionBar(Toolbar)

        val navigationView = findViewById<NavigationView>(R.id.nav_view)
        navigationView.setNavigationItemSelectedListener(this)

        toggle = ActionBarDrawerToggle(
            this@DrawerActivity,
            drawerLayout,
            Toolbar,
            R.string.menu_drawer_open,
            R.string.menu_drawer_close
        )
        if (drawerLayout != null) {
            drawerLayout.addDrawerListener(toggle)
        }
        toggle.syncState()

    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {

        drawerLayout.closeDrawer(GravityCompat.START)

        when(item.itemId){

            R.id.birds-> {
                startActivity(Intent(this, MainActivity::class.java))
            }
            R.id.help-> {
                startActivity(Intent(this, FinalActivity1::class.java))
            }

            R.id.about_us-> {
                startActivity(Intent(this, AboutUsActivity::class.java))
            }

            R.id.message->{
                startActivity(Intent(this, ActivityShare::class.java))
            }

            R.id.tráfico-> {
                startActivity(Intent(this, HelpActivity::class.java))
            }
        }

        return false

    }

    protected fun alocateActivityTitle(titleString: String) {

        if (supportActionBar!=null){
            supportActionBar!!.setTitle(titleString)


            }
        }

    }












