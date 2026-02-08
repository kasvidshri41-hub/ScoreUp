package com.example.scoreup.admin.dashboard

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.scoreup.R
import com.example.scoreup.auth.LoginActivity
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.bottomnavigation.BottomNavigationView

class AdminDashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin_dashboard)

        val toolbar = findViewById<MaterialToolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        toolbar.setOnMenuItemClickListener {
            if (it.itemId == R.id.action_logout) {
                startActivity(Intent(this, LoginActivity::class.java))
                finish()
                true
            } else false
        }

        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNav)
        bottomNav.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.nav_home -> true
                R.id.nav_users -> true
                R.id.nav_settings -> true
                else -> false
            }
        }
    }
}

